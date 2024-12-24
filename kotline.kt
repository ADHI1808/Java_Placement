package com.example.translationandhistory

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.camera.core.Camera
import androidx.camera.core.CameraSelector
import androidx.camera.core.Preview
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.camera.view.PreviewView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.LifecycleOwner
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val CAMERA_PERMISSION_REQUEST_CODE = 1001
    private var isTorchOn = false
    private var camera: Camera? = null
    private var isCameraFrozen = false  // Variable to track camera freeze state
    private var cameraProvider: ProcessCameraProvider? = null // Store camera provider to use in both freeze and start methods

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize UI components
        val menuButton: ImageButton = findViewById(R.id.menu)
        val historyButton: ImageButton = findViewById(R.id.history)
        val translationButton: ImageButton = findViewById(R.id.translation_bt)
        val flashButton: ImageButton = findViewById(R.id.flash)
        val leftdropdownIcon = findViewById<ImageView>(R.id.leftdropdown)
        val leftrecyclerView = findViewById<RecyclerView>(R.id.left_recyclerview)
        val leftoption = findViewById<TextView>(R.id.leftoption)
        val leftoptionimage = findViewById<ImageView>(R.id.leftoptionimage)

        // Set up default values
        val defaultItem = "Option 1"
        val defaultImageResId = R.drawable.flag // Replace with actual default image resource

        // Load the saved selected item and image from SharedPreferences
        val sharedPreferences = getSharedPreferences("AppPrefs", Context.MODE_PRIVATE)
        val lastSelectedItem = sharedPreferences.getString("selectedItem", defaultItem)
        val lastSelectedImageResId = sharedPreferences.getInt("selectedImageResId", defaultImageResId)

        // Set the saved item or default item to TextView
        leftoption.text = lastSelectedItem ?: defaultItem

        // Display the saved or default image in the ImageView
        leftoptionimage.setImageResource(lastSelectedImageResId)
        leftoptionimage.visibility = View.VISIBLE // Make sure the ImageView is visible

        // Set up RecyclerView with options and corresponding images
        val options = listOf("Option 1", "Option 2", "Option 3", "Option 4", "Option 5",)
        val images = listOf(
            R.drawable.flag, // Replace with actual image resources
            R.drawable.flag,
            R.drawable.flag,
            R.drawable.flag,
            R.drawable.flag,
        )

        val adapter = DropdownAdapter(options) { selectedItem ->
            // Handle item selection
            Toast.makeText(this, "Selected: $selectedItem", Toast.LENGTH_SHORT).show()

            // Save the selected item and corresponding image resource ID to SharedPreferences
            val editor = sharedPreferences.edit()
            editor.putString("selectedItem", selectedItem)

            // Save the corresponding image resource ID
            val selectedImageResId = images[options.indexOf(selectedItem)]
            editor.putInt("selectedImageResId", selectedImageResId)
            editor.apply()

            // Update TextView and ImageView with the selected item and image
            leftoption.text = selectedItem
            leftoptionimage.setImageResource(selectedImageResId)
        }

        leftrecyclerView.layoutManager = LinearLayoutManager(this)
        leftrecyclerView.adapter = adapter

        // Toggle RecyclerView visibility and change dropdown arrow direction on ImageView click
        leftdropdownIcon.setOnClickListener {
            if (leftrecyclerView.visibility == View.GONE) {
                leftrecyclerView.visibility = View.VISIBLE
                leftdropdownIcon.setImageResource(android.R.drawable.arrow_up_float) // Change to up arrow
            } else {
                leftrecyclerView.visibility = View.GONE
                leftdropdownIcon.setImageResource(android.R.drawable.arrow_down_float) // Change to down arrow
            }
        }

        // Handle window insets for padding
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        // Set listeners for UI components
        menuButton.setOnClickListener { /* Handle menu button click */ }
        historyButton.setOnClickListener { /* Handle history button click */ }

        translationButton.setOnClickListener {
            // Toggle camera freeze and change icon accordingly
            if (isCameraFrozen) {
                startCamera() // Restart camera preview when camera is unfrozen
            } else {
                freezeCamera() // Freeze camera preview when camera is frozen
            }
            isCameraFrozen = !isCameraFrozen  // Toggle the freeze state
        }

        flashButton.setOnClickListener { toggleTorch(flashButton) }

        // Handle camera permission and start preview at app launch
        if (!checkCameraPermission()) {
            requestCameraPermission()
        } else {
            openCameraPreview()
        }
    }

    private fun checkCameraPermission(): Boolean {
        return ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED
    }

    private fun requestCameraPermission() {
        ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CAMERA), CAMERA_PERMISSION_REQUEST_CODE)
    }



    private fun openCameraPreview() {
        val previewView: PreviewView = findViewById(R.id.camera_preview)
        val cameraProviderFuture = ProcessCameraProvider.getInstance(this)
        cameraProviderFuture.addListener({
            cameraProvider = cameraProviderFuture.get() // Store the camera provider to use later
            val preview = Preview.Builder().build().apply {
                setSurfaceProvider(previewView.surfaceProvider)
            }
            val cameraSelector = CameraSelector.DEFAULT_BACK_CAMERA
            try {
                cameraProvider!!.unbindAll()
                camera = cameraProvider!!.bindToLifecycle(this, cameraSelector, preview)
            } catch (e: Exception) {
                Toast.makeText(this, "Failed to start camera: ${e.message}", Toast.LENGTH_SHORT).show()
            }
        }, ContextCompat.getMainExecutor(this))
    }

    private fun freezeCamera() {
        cameraProvider?.unbindAll() // Unbind all use cases to freeze the camera
        camera?.cameraControl?.enableTorch(false) // Turn off the torch if necessary
    }

    private fun startCamera() {
        val previewView: PreviewView = findViewById(R.id.camera_preview)
        val cameraProviderFuture = ProcessCameraProvider.getInstance(this)
        cameraProviderFuture.addListener({
            val preview = Preview.Builder().build().apply {
                setSurfaceProvider(previewView.surfaceProvider)
            }
            val cameraSelector = CameraSelector.DEFAULT_BACK_CAMERA
            try {
                cameraProvider!!.unbindAll()  // Unbind all use cases before rebinding
                camera = cameraProvider!!.bindToLifecycle(this, cameraSelector, preview)  // Re-bind camera use cases
            } catch (e: Exception) {
                Toast.makeText(this, "Failed to start camera: ${e.message}", Toast.LENGTH_SHORT).show()
            }
        }, ContextCompat.getMainExecutor(this))
    }

    private fun toggleTorch(flashButton: ImageButton) {
        if (camera != null) {
            isTorchOn = !isTorchOn
            camera!!.cameraControl.enableTorch(isTorchOn)
            if (isTorchOn) {
                flashButton.setImageResource(R.drawable.flash_off)  // Update to `flash_on` icon
                Toast.makeText(this, "Torch is ON", Toast.LENGTH_SHORT).show()
            } else {
                flashButton.setImageResource(R.drawable.flash_on)  // Update to `flash_off` icon
                Toast.makeText(this, "Torch is OFF", Toast.LENGTH_SHORT).show()
            }
        } else {
            Toast.makeText(this, "Camera not initialized", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == CAMERA_PERMISSION_REQUEST_CODE) {
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                openCameraPreview()
            } else {
                Toast.makeText(this, "Camera permission denied", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

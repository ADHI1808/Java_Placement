import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        // Input array
        int[] myArray = {64, 34, 25, 12, 22, 11, 90, 5};

        int n = myArray.length;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {
            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    // Swap using a temporary variable
                    int temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(myArray));
    }
}

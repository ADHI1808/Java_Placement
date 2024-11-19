import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the decimal number
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        
        // Convert decimal to binary
        String binary = convertToBinary(decimal);
        
        // Output the binary representation
        System.out.println("Binary representation: " + binary);
        
        scanner.close();
    }
    
    // Method to convert a decimal number to binary using String
    public static String convertToBinary(int decimal) {
        String binary = ""; // Initialize an empty string
        
        // Edge case for 0
        if (decimal == 0) {
            return "0";
        }
        
        // Calculate binary representation
        while (decimal > 0) {
            int remainder = decimal % 2; // Get the remainder
            binary = remainder + binary; // Prepend the remainder to the string
            decimal /= 2; // Divide by 2
        }
        
        return binary; // Return the final binary representation
    }
}

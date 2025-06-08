import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a decimal number
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        // Convert to binary string
        String binaryString = Integer.toBinaryString(decimal);

        // Convert binary string to integer (just the digits, not actual binary value)
        int binaryAsInt = Integer.parseInt(binaryString);

        // Display the result
        System.out.println("Binary representation as int: " + binaryAsInt);

        scanner.close();
    }
}

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input 1: String
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Check if the string contains only alphabets
        if (!inputString.matches("[a-zA-Z]+")) {
            System.out.println("Invalid input");
            return;
        }

        // Input 2: Integer
        System.out.print("Enter the number of characters to reverse: ");
        String inputNumber = scanner.nextLine();

        // Check if input is a valid integer
        if (!inputNumber.matches("\\d+")) {
            System.out.println("Invalid input");
            return;
        }

        int numCharacters = Integer.parseInt(inputNumber);

        // Check if the number is less than zero
        if (numCharacters < 0) {
            System.out.println("Invalid input");
            return;
        }

        // If numCharacters > length of string, print string normally
        if (numCharacters > inputString.length()) {
            System.out.println(inputString);
            return;
        }

        // Reverse the specified number of characters
        String reversedPart = new StringBuilder(inputString.substring(0, numCharacters)).reverse().toString();
        String remainingPart = inputString.substring(numCharacters);

        // Output the final result
        System.out.println(reversedPart + remainingPart);
    }
}
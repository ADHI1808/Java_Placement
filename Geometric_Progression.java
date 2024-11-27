import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: First term (a), common ratio (d), and number of terms (n)
        System.out.print("Enter the first term (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the common ratio (d): ");
        int d = scanner.nextInt();

        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();

        // Check if n is valid
        if (n <= 0) {
            // If the term number is less than or equal to 0, it's invalid
            System.out.println("Invalid Input");
        } else {
            // Calculate the nth term using the formula T_n = a * d^(n-1)

            // Math.pow(d, n-1) calculates d^(n-1) as a double
            // Multiplication with a might result in large numbers, so we use long
            // The result is cast to long to ensure it fits in a larger data type
            long nthTerm = (long) (a * Math.pow(d, n - 1)); 

            /*
            Explanation of `long`:
            - A `long` can store much larger values compared to an `int`.
            - GP terms grow exponentially because of d^(n-1), and the result can 
              exceed the range of an int (approximately -2.1 billion to +2.1 billion).
            - By using long, we ensure the program can handle values up to 9.2 quintillion.
            */

            // Output the nth term
            System.out.println("Last term value is: " + nthTerm);
        }

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}

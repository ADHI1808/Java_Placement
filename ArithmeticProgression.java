import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first term (a)
        System.out.print("Enter the 1st term (a): ");
        int a = scanner.nextInt();

        // Input for the common difference (d)
        System.out.print("Enter the common difference (d): ");
        int d = scanner.nextInt();

        // Input for the number of terms (n)
        System.out.print("Enter the nth term position (n): ");
        int n = scanner.nextInt();

        // Check for valid n value
        if (n <= 0) {
            System.out.println("InValid Input");
        } else {
            // Calculate the nth term using the formula: Tn = a + (n - 1) * d
            int nthTerm = a + (n - 1) * d;

            // Print the nth term value
            System.out.println("The " + n + "th term of the AP series is: " + nthTerm);
        }

        scanner.close();
    }
}

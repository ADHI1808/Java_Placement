import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x;
        System.out.println("Enter number:");
        x = s.nextInt();
        System.out.println(isStrong(x) ? "Yes, Strong number" : "Not a Strong Number");
        s.close();
    }

    // Function to calculate factorial of a digit
    public static int fact(int n) {
        int fato = 1;
        for (int i = 1; i <= n; i++) {
            fato *= i;
        }
        return fato;
    }

    // Function to check if a number is a Strong number
    public static boolean isStrong(int st) {
        int rem, temp, sum = 0;
        temp = st;
        while (temp > 0) {
            rem = temp % 10; // Extract last digit
            sum += fact(rem); // Add factorial of the digit
            temp /= 10; // Remove last digit
        }
        return sum == st; // Check if sum equals the original number
    }
}

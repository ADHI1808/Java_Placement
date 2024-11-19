
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String len;
        int a, temp, rem = 0,pow;
        double sum = 0; // Use double since Math.pow returns double

        System.out.println("Enter number:");
        a = s.nextInt();
        temp = a;
        len = Integer.toString(a);
        pow = len.length();

        while (temp > 0) {
            rem = temp % 10; // Extract the last digit
            temp = temp / 10; // Remove the last digit
            sum = sum + Math.pow(rem, pow); // Calculate digit^length
        }

        if (sum == a) {
            System.out.println("It is an Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
        s.close();
    }
}

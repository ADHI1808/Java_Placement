import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        // Input the number
        int x = s.nextInt();
        
        // Variable to hold the sum of digits
        int sum = 0;
        
        // Start the processing with the given number
        int temp = x;
        
        // Keep summing the digits until the result is a single digit
        while (temp >= 0) {
            sum = 0;  // Reset sum for each new iteration
            while (temp > 0) {
                int rem = temp % 10; // Get the last digit
                sum += rem;           // Add it to sum
                temp /= 10;           // Remove the last digit
            }
            temp = sum;  // Set temp to the sum of digits
        }
        
        // Output the final single-digit sum
        System.out.println(temp);
        
        s.close();  // Close scanner
    }
}

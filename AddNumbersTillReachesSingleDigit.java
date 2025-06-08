import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        // Input the number
        int x = s.nextInt();
        int sum = 1 + (x - 1) % 9;
        s.close();  // Close scanner
    }
}

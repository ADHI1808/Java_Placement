public class GCDExample {
    // Method to find GCD using recursion
    public static int findGCD(int a, int b) {
        if (b == 0)
            return a; // Base case
        return findGCD(b, a % b); // Recursive call
    }

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 18;
        int gcd = findGCD(num1, num2);

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }
}

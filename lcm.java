public class LCMExample {

    // Method to find GCD using recursion (Euclidean Algorithm)
    public static int findGCD(int a, int b) {
        if (b == 0)
            return a;
        return findGCD(b, a % b);
    }

    // Method to find LCM using GCD
    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 18;

        int lcm = findLCM(num1, num2);

        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}

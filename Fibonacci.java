public class FibonacciSequence {
    public static void main(String[] args) {
        int n = 8; // Number of terms to generate
        int p1 = 0, p2 = 1;

        System.out.print(p1 + ", " + p2);

        for (int i = 3; i <= n; i++) {//starts at 3 since 1->0,2->1
            int s = p1 + p2;
            System.out.print(", " + s);
            p1 = p2;
            p2 = s;
        }

        System.out.print("."); // Add a period at the end
    }
}

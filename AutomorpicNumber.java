import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, sq;
        System.out.println("Enter Number");
        a = s.nextInt();
        sq = a * a;

        boolean isAutomorphic = true;

        while (a > 0) {
            if (a % 10 != sq % 10) {
                isAutomorphic = false; // Mark as not Automorphic
                break;
            }
            a /= 10;
            sq /= 10;
        }

        if (isAutomorphic) {
            System.out.println("Yes, Automorphic");
        } else {
            System.out.println("Not Automorphic");
        }

        s.close();
    }
}

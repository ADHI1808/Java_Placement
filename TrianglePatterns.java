import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Right Triangle
        System.out.println("\nRight Triangle:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Reverse Triangle
        System.out.println("\nReverse Triangle:");
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j <= rows; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Pyramid 
        System.out.println("\nPyramid:");
        for (int i = 1; i <= rows; i++) {
            // Reuse logic of Reverse Triangle for spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            // Reuse logic of Right Triangle for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Add remaining stars (to complete the pyramid)
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        scanner.close();
    }
}

import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Input array elements
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Sort the array
        Arrays.sort(array);

        // Print unique elements
        System.out.print("Array without duplicates: ");
        System.out.print(array[0]); // Print the first element
        for (int i = 1; i < n; i++) {
            if (array[i] != array[i - 1]) { // Skip duplicates
                System.out.print(" " + array[i]);
            }
        }

        scanner.close();
    }
}

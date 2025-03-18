import java.util.Scanner;

class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int reversed = 0;

        System.out.println("Enter the number");
        int no = sc.nextInt();

        int lengthOfInt = String.valueOf(no).length();

        if (lengthOfInt == 4) {
            int originalNo = no; // Store original number for later use
            
            // Reverse the number
            while (no != 0) {
                int digit = no % 10;
                reversed = reversed * 10 + digit;
                no /= 10;
            }

            System.out.println("Reversed number is " + reversed);

            // Expanding the reversed number
            int placeValue = 1;
            String result = "";

            while (reversed > 0) {
                int digit = reversed % 10;
                if (digit > 0) {
                    result = (digit * placeValue) + (result.isEmpty() ? "" : " + " + result);
                }
                reversed /= 10;
                placeValue *= 10;
            }

            System.out.println(result);
        } else {
            System.out.println(no + " is an invalid number");
        }

        sc.close();
    }
}

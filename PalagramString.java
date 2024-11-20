import java.util.Scanner;

class Main {
    public static boolean isPangram(String input) {
        // Convert the input to lowercase to handle case insensitivity
        input = input.toLowerCase();
        
        // Create a boolean array to mark the occurrence of each letter
        boolean[] lettersPresent = new boolean[26];
        int index;

        // Traverse the string
        for (char ch : input.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') { 
                index = ch - 'a';//to get number i.e a-a=0,b-a=1,c-a=2...z-a=15
                //if all number are there in letterspresent it will be true
                lettersPresent[index] = true;
            }
        }

        // Check if all letters are present
        for (int i = 0; i < lettersPresent.length; i++) {
            if (!lettersPresent[i]) {
                return false; // If any letter is missing, it's not a pangram
            }
        }

        return true; // All letters are present, so it's a pangram
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        if (isPangram(input)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }

        scanner.close();
    }
}

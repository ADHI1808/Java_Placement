import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the input string:");
        String input = scanner.nextLine();
        
        // Check if the input contains only alphabets
        if (!input.matches("[a-zA-Z]+")) {
            System.out.println("Invalid Input");
            return;
        }
        else{
        String vowels = "AEIOUaeiou";
        int vowelCount = 0;
        StringBuilder consonants = new StringBuilder();
        
        for (char ch : input.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                vowelCount++;
            } else {
                consonants.append(ch);
            }
        }
        
        System.out.println("No of Vowels " + vowelCount);
        System.out.println("Consonants");
        System.out.println(consonants.toString());
        }
    }
}

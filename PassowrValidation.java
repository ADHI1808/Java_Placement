import java.util.Scanner;

public class PerfectPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the password:");
        String password = scanner.nextLine();

        // Check if password length is exactly 9
        if (password.length() != 9) {
            System.out.println("Not a Perfect Password");
            return;
        }

        boolean hasLowercase = false;
        boolean hasUppercase = false;
        boolean hasNumber = false;
        boolean hasSpecialChar = false;

        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                hasLowercase = true;
            } else if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (Character.isDigit(c)) {
                hasNumber = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
            }
        }

        // Combine all conditions
        if (hasLowercase && hasUppercase && hasNumber && hasSpecialChar) {
            System.out.println("Perfect Password");
        } else {
            System.out.println("Not a Perfect Password");
        }
    }
}

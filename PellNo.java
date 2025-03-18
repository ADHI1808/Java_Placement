import java.util.Scanner;

class MagicGoose {
    // Method to calculate Pell numbers
    public static int getPellNumber(int day) {
        if (day == 1) return 1;
        if (day == 2) return 2;
        
        int prev2 = 1, prev1 = 2, current = 0;
        for (int i = 3; i <= day; i++) {
            current = 2 * prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return current;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the day");
        int day = scanner.nextInt();
        
        if (day <= 0 || day > 30) {
            System.out.println(day + " is an invalid day");
        } else {
            int eggs = getPellNumber(day);
            System.out.println("Number of eggs laid in the " + day + "th day is " + eggs);
        }
        
        scanner.close();
    }
}

/*
 * Short trick to remember Pell numbers:
 * - Each number is **twice** the previous number plus the one before it.
 * - Pattern: 1, 2, (2×2+1)=5, (2×5+2)=12, (2×12+5)=29, ...
 * - Easy way: "Double the last, add the second last!"
 */

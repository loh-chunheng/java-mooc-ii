
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Checker checker = new Checker();
        
        /* System.out.println("Enter a string (day of week):");
        String word1 = scanner.nextLine();
        
        if (checker.isDayOfWeek(word1)) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }
        
        System.out.println("Enter a string (vowels only):");
        String word2 = scanner.nextLine();
        
        if (checker.allVowels(word2)) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        } */
        
        System.out.println("Enter time of day in 24-hour format (hh:mm:ss):");
        String time = scanner.nextLine();
        
        if (checker.timeOfDay(time)) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }
        
        
    }
}

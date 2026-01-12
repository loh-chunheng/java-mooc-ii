
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int countPositive = 0;
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            
            if (number > 0) {
                sum += number;
                countPositive ++;
            }
        }
        
        if (countPositive > 0) {
            System.out.println(sum * 1.0 / countPositive);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}

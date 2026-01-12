
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            int number = Integer.valueOf(parts[1]);
            
            if (number < 0) {
                System.out.println("");
                continue;
            }
            
            if (parts[0].equals("add")) {
                first += number;
                
                if (first > 100) {
                    first = 100;
                }
            }
            
            if (parts[0].equals("move")) {
                if (number > first) {
                    number = first;
                }
                
                first -= number;
                second += number;
                
                if (second > 100) {
                    second = 100;
                }
            }

            if (parts[0].equals("remove")) {
                if (number > second) {
                    number = second;
                }
                
                second -= number;
            }
            
            System.out.println("");
        }
    }

}

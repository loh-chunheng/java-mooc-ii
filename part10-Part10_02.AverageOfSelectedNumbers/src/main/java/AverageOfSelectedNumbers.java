
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> numbers = new ArrayList<>();
        
        System.out.println("Input integers (type \"end\" to stop):");
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("end")) {
                break;
            }
            
            numbers.add(input);
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        
        String selection = scanner.nextLine();
        
        if (selection.equalsIgnoreCase("n")) {
            double averageN = numbers.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(num -> num < 0)
                .average()
                .getAsDouble();
            
            System.out.println("Average of the negative numbers: " + averageN);
            
        } else {
            double averageP = numbers.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(num -> num > 0)
                .average()
                .getAsDouble();
            
            System.out.println("Average of the negative numbers: " + averageP);
        }
    }
}

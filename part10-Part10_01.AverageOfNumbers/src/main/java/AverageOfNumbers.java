
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

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
        
        double average = numbers.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();
        
        System.out.println("Average of the numbers: " + average);

    }
}

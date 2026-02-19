
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<>();
        System.out.println("Input integer (give a negative number to stop):");

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input < 0) {
                break;
            }

            inputs.add(input);
        }
        
        inputs.stream().filter(num -> num >= 1 && num <= 5)
                .forEach(num -> System.out.println(num));
    }
}

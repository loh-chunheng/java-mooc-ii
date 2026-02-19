
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(-3);
        numbers.add(-7);
        numbers.add(0);
        
        System.out.println("Positive numbers are:");
        System.out.println(positive(numbers));
    }
    
    public static List<Integer> positive(List<Integer> numbers) {
        List positive = numbers.stream()
                .filter(num -> num > 0)
                //.collect(Collectors.toCollection(ArrayList::new));
                .collect(Collectors.toList());
        
        return positive;
    }

}

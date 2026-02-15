
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Input the name of the book, empty stops:");
            String name = scanner.nextLine();
            
            if (name.equals("")) {
                break;
            }
            
            System.out.println("Input the age recommendation:");
            int age = Integer.valueOf(scanner.nextLine());
            
            System.out.println("");
            
            books.add(new Book(name, age));
            
        }
        
        Comparator<Book> comparator = Comparator.
                comparing(Book::getAge)
                .thenComparing(Book::getName);
        Collections.sort(books, comparator);
        
        System.out.println(books.size() + " books in total.");
        System.out.println("");
        System.out.println("Books:");
        
        books.stream().forEach(b -> System.out.println(b));
    }

}

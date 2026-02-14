
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
//import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        
        String file = "bookfile.txt";
        
        readBooks(file).stream()
                .forEach(book -> 
                        System.out.printf("%s, %d, %d, %s%n",
                                book.getName(), book.getPublishingYear(), book.getPagecount(), book.getAuthor()));

    }
    
    public static List<Book> readBooks(String file) {
        
        List<Book> books = new ArrayList<>();
        
        try {
            books = Files.lines(Paths.get(file))
                    .map(row -> row.split(","))
                    .filter(parts -> parts.length >= 4)
                    .map(parts -> new Book(parts[0],Integer.valueOf(parts[1]),Integer.valueOf(parts[2]),parts[3]))
                    .collect(Collectors.toCollection(ArrayList::new));
        } catch (Exception e) {
            System.out.println("Errors: " + e.getMessage());    
        }
        
        return books;
    }

}

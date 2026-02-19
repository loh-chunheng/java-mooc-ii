
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        
        List<String> data = readFile("literacy.csv");
        
        
        storeData(data).stream()
                .sorted((p1, p2) -> {
                    return Double.compare(p1.getLiteracyRate(),p2.getLiteracyRate());
                })
                .forEach(ld -> System.out.println(ld));
        
        
    }
    
    public static List<String> readFile(String file) {
        List<String> rows = new ArrayList<>();
        
        try {
            rows = Files.lines(Paths.get(file))
                .collect(Collectors.toCollection(ArrayList:: new));
        } catch (Exception e) {
            System.out.println("Errors: " + e.getMessage());
        }
        
        return rows;
    }
    
    public static List<LiteracyData> storeData(List<String> data) {
        List<LiteracyData> records = new ArrayList<>();
        
        records = data.stream()
                .map(s -> s.split(","))
                .filter(parts -> parts.length >= 6)
                .map(parts -> new LiteracyData(parts[3], Integer.valueOf(parts[4]), parts[2].split(" ")[1], Double.valueOf(parts[5])))
                .collect(Collectors.toCollection(ArrayList:: new));
        
        return records;
    }
}

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<SimpleDate, String> holidays = new HashMap<>();
        
        SimpleDate date2025 = new SimpleDate(1, 1, 2025);
        SimpleDate date2026 = new SimpleDate(1, 1, 2026);
        
        holidays.put(date2025, "Last New Year");
        holidays.put(date2026, "This New Year");
        
        System.out.println(holidays.get(date2025));
        System.out.println(holidays.get(new SimpleDate(1, 1, 2026)));

    }
}

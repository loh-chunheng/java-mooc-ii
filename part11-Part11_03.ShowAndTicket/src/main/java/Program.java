
//import java.util.Scanner;
public class Program {

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        Show avatar = new Show("Avatar", "12:05");
        Show harryPotter = new Show("Harry Potter", "15:30");

        Ticket ticket1 = new Ticket(1, 1001, avatar);
        Ticket ticket2 = new Ticket(2, 1002, avatar);
        Ticket ticket3 = new Ticket(3, 1003, avatar);
        Ticket ticket4 = new Ticket(11, 2011, harryPotter);
        Ticket ticket5 = new Ticket(12, 2012, harryPotter);
        
        
    }
}

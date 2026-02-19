import java.util.Scanner;

public class Store {
    private Warehouse warehouse;
    private Scanner scanner;

    public Store(Warehouse warehouse, Scanner scanner) {
        this.warehouse = warehouse;
        this.scanner = scanner;
    }
    
    public void shop(String customer) {
        System.out.println("Welcom to the store " + customer);
        System.out.println("Our Selection:");
        for (String product: warehouse.products()) {
            System.out.println(product);
        }
        
        ShoppingCart cart = new ShoppingCart();
        
        
        while (true) {
            System.out.println("What to put in the cart? (press ENTER to proceed to checkout)");
            String input = scanner.nextLine();
            
            if (input.isEmpty()) {
                break;
            }
            
            if (this.warehouse.take(input)) {
                cart.add(input, this.warehouse.price(input));
                System.out.println(input + " added successfully!");
            } else {
                System.out.println("Sorry! Item not available.");
            }
            
        }
        
        checkout(cart);
        
    }
    
    public static void checkout(ShoppingCart cart) {
        System.out.println("Your cart items:");
        cart.print();
        System.out.println("Total Price: " + cart.price());
    }

}

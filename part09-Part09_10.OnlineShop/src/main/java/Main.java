
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("coffee", 5, 1);
        warehouse.addProduct("milk", 3, 10);
        
        System.out.println("prices:");
        System.out.println("milk: " + warehouse.price("milk"));
        System.out.println("coffee: " + warehouse.price("coffee"));
        System.out.println("sugar: " + warehouse.price("sugar"));

        System.out.println("stock:");
        System.out.println("coffee:  " + warehouse.stock("coffee"));
        System.out.println("sugar: " + warehouse.stock("sugar"));

        System.out.println("taking coffee " + warehouse.take("coffee"));
        System.out.println("taking coffee " + warehouse.take("coffee"));
        System.out.println("taking sugar " + warehouse.take("sugar"));

        System.out.println("stock:");
        System.out.println("coffee:  " + warehouse.stock("coffee"));
        System.out.println("sugar: " + warehouse.stock("sugar"));
        
        System.out.println("--------------------------------");
        
        warehouse.addProduct("milk", 3, 10);
        warehouse.addProduct("coffee", 5, 6);
        warehouse.addProduct("buttermilk", 2, 20);
        warehouse.addProduct("yogurt", 2, 20);

        System.out.println("products:");

        for (String product: warehouse.products()) {
            System.out.println(product);
        }
        
        System.out.println("---------------------------------");
        
        Item item = new Item("milk", 4, 2);
        System.out.println("an item that contains 4 milks has the total price of " + item.price());
        System.out.println(item);
        item.increaseQuantity();
        System.out.println(item);
        
        System.out.println("---------------------------------");
        
        ShoppingCart cart1 = new ShoppingCart();
        cart1.add("milk", 3);
        cart1.add("buttermilk", 2);
        cart1.add("cheese", 5);
        System.out.println("cart price: " + cart1.price());
        cart1.add("computer", 899);
        System.out.println("cart price: " + cart1.price());
        
        cart1.print();
        
        System.out.println("---------------------------------");
        
        ShoppingCart cart = new ShoppingCart();
        cart.add("milk", 3);
        cart.print();
        System.out.println("cart price: " + cart.price() + "\n");

        cart.add("buttermilk", 2);
        cart.print();
        System.out.println("cart price: " + cart.price() + "\n");

        cart.add("milk", 3);
        cart.print();
        System.out.println("cart price: " + cart.price() + "\n");

        cart.add("milk", 3);
        cart.print();
        System.out.println("cart price: " + cart.price() + "\n");   
        
        Warehouse warehouse2 = new Warehouse();
        warehouse2.addProduct("coffee", 5, 10);
        warehouse2.addProduct("milk", 3, 20);
        warehouse2.addProduct("cream", 2, 55);
        warehouse2.addProduct("bread", 7, 8);

        Scanner scanner = new Scanner(System.in);

        Store store = new Store(warehouse2, scanner);
        store.shop("John");
        
    }
}

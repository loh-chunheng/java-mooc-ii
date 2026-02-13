import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> productPrice;
    private Map<String, Integer> productStock;
    
    public Warehouse() {
        this.productPrice = new HashMap<>();
        this.productStock = new HashMap<>();
        
    }
    
    public void addProduct(String product, int price, int stock) {
        this.productPrice.put(product, price);
        this.productStock.put(product, stock);
    }
    
    public int price(String product) {
        return productPrice.getOrDefault(product, -99);
    }
    
    public int stock(String product) {
        return productStock.getOrDefault(product, 0);
    }
    
    public boolean take(String product) {
        if (stock(product) < 1) {
            return false;
        }
        
        this.productStock.put(product, stock(product) - 1);
        return true;
    }
    
    public Set<String> products() {
        return productPrice.keySet();
    }
}

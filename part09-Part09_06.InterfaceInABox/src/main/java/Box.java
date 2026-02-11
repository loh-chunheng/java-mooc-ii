import java.util.ArrayList;

public class Box implements Packable {
    
    private ArrayList<Packable> items;
    private double capacity;
    
    public Box(double capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    
    public void add(Packable item) {
        if (item.weight() + this.weight() > this.capacity) {
            return;
        }
        
        this.items.add(item);
    }
    
    @Override
    public double weight() {
        double weight = 0;
        for (Packable item: items) {
            weight += item.weight();
        }
        return weight;
    }
    
    @Override
    public String toString() {
        return "Box: " + items.size() + " items, total weight " + weight() + " kg";
    }
}

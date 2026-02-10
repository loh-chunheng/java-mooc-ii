import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity) {
        super();
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    
    @Override
    public void add(Item item) {
              
        if (this.weightofItems() + item.getWeight() <= this.capacity) {
            this.items.add(item);
        }
    }
    
    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
    
    private int weightofItems() {
        int weight = 0;
        for (Item i: this.items) {
            weight += i.getWeight();
        }
        return weight;
    }
}

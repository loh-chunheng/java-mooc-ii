import java.util.ArrayList;

public class Herd implements Movable {
    private ArrayList<Movable> animals;
    
    public Herd() {
        this.animals = new ArrayList<>();
    }
    
    @Override
    public String toString() {
        String toPrint = "";
        
        for (Movable movable: this.animals) {
            toPrint += movable.toString();
            toPrint += "\n";
        }
        
        return toPrint;
    }
    
    public void addToHerd(Movable movable) {
        this.animals.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        for (Movable movable: this.animals) {
            movable.move(dx, dy);
        }
    }
}

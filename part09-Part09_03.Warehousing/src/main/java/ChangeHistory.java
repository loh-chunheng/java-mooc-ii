import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> changes;
    
    public ChangeHistory() {
        this.changes = new ArrayList<>();
    }
    
    public void add(double status) {
        this.changes.add(status);
    }
    
    public void clear() {
        this.changes.clear();
    }
    
    @Override
    public String toString() {
        return this.changes.toString();
    }
    
    public double maxValue() {
        if (this.changes.isEmpty()) {
            return 0.0;
        }
        
        double max = 0.0;
        for (double change: this.changes) {
            if (change > max) {
                max = change;
            }
        }
        
        return max;
    }
    
    public double minValue() {
        if (this.changes.isEmpty()) {
            return 0.0;
        }
        
        double min = this.changes.get(0);
        for (double change: this.changes) {
            if (change < min) {
                min = change;
            }
        }
        
        return min;
    }
    
    public double average() {
        if (this.changes.isEmpty()) {
            return 0.0;
        }
        
        double sum = 0.0;
        for (double change: this.changes) {
            sum += change;
        }
        
        return sum / this.changes.size();
    }
}

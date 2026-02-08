
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory changeRecord;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.changeRecord = new ChangeHistory();
        this.addToWarehouse(initialBalance);
    }
    
    @Override
    public final void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        changeRecord.add(this.getBalance()); 
    }
    
    @Override
    public double takeFromWarehouse(double amount) {
        double amountTaken = super.takeFromWarehouse(amount);
        changeRecord.add(this.getBalance());
        return amountTaken;
    }
    
    public String history() {
        return this.changeRecord.toString();
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + this.history());
        System.out.println("Largest amount of product: " + this.changeRecord.maxValue());
        System.out.println("Smallest amount of product: " + this.changeRecord.minValue());
        System.out.printf("Average: %.1f", this.changeRecord.average());
    }
    
}

import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> vehicleOwners;
    
    public VehicleRegistry() {
        vehicleOwners = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if (vehicleOwners.containsKey(licensePlate)) {
            return false;
        } else {
            vehicleOwners.put(licensePlate, owner);
            return true;
        }
    }
    
    public String get(LicensePlate licensePlate) {
        return vehicleOwners.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (vehicleOwners.containsKey(licensePlate)) {
            vehicleOwners.remove(licensePlate);
            return true;
        } else {
            return false;
        }
    }
    
    public void printLicensePlates() {
        for (LicensePlate licensePlate: this.vehicleOwners.keySet()) {
            System.out.println(licensePlate);
        }
    }
    
    public void printOwners() {
        ArrayList<String> printedOwners = new ArrayList<>();
        
        for (String owner: vehicleOwners.values()) {
            if (!(printedOwners.contains(owner))) {
                System.out.println(owner);
                printedOwners.add(owner);
            }
        }
    }
}

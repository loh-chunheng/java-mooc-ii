
import java.util.ArrayList;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
        // the following is the same sample program shown in ex 8.13 description
        
        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");

        ArrayList<LicensePlate> finnishPlates = new ArrayList<>();
        finnishPlates.add(li1);
        finnishPlates.add(li2);

        LicensePlate newLi = new LicensePlate("FI", "ABC-123");
        if (!finnishPlates.contains(newLi)) {
            finnishPlates.add(newLi);
        }
        System.out.println("Finnish: " + finnishPlates);
        // if the equals-method hasn't been overwritten, the same license number will be added to the list againg
        
        VehicleRegistry owners = new VehicleRegistry();
        System.out.println("Adding vehicle owners:");
        System.out.println(owners.add(li1, "Arto"));
        System.out.println(owners.add(li3, "Jürgen"));
        System.out.println(owners.add(li1, "Andy"));
        System.out.println(owners.add(li2, "Arto"));
        System.out.println(owners.add(new LicensePlate("D", "B WQ-999"), "Susan"));
        System.out.println("");
        
        System.out.println("Removing vehicle owners:");
        System.out.println(owners.remove(new LicensePlate("D", "B WQ-999")));
        System.out.println(owners.remove(new LicensePlate("FI", "B WQ-999")));
        System.out.println("");
        
        System.out.println("get vehicle owners:");
        System.out.println(owners.get(new LicensePlate("FI", "ABC-123")));
        System.out.println(owners.get(new LicensePlate("FI", "ABC-456")));
        System.out.println("");
        // if the hasCode-method hasn't been overwritten, the owners won't be found
        System.out.println("All License Plates:");
        owners.printLicensePlates();
        System.out.println("");
        
        System.out.println("owners:");
        owners.printOwners();
        
    }
}

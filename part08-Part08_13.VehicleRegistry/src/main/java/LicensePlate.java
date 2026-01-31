
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        
        final LicensePlate compared = (LicensePlate) obj;
        
        if (this.liNumber.equals(compared.liNumber) &&
                this.country.equals(compared.country)) {
            return true;
        }
        
        return false;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.country.hashCode();
        hash = 31 * hash + this.liNumber.hashCode();
        return hash;
    }

}

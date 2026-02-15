
public class LiteracyData {
    private String country;
    private int year;
    private String gender;
    private double literacyRate;
    
    public LiteracyData(String country, int year, String gender, double literacyRate) {
        this.country = country;
        this.gender = gender;
        this.year = year;
        this.literacyRate = literacyRate;
    }
    
    public double getLiteracyRate() {
        return this.literacyRate;
    }
    
    @Override
    public String toString() {
        return country + " (" + year + "), " + gender + ", " + literacyRate;
    }
}

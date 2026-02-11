
public class CD implements Packable {
    
    private String artist;
    private String name;
    private int publicationYear;
    
    public CD(String artist, String name, int year) {
        this.artist = artist;
        this.name = name;
        this.publicationYear = year;
    }
    
    @Override
    public double weight() {
        return 0.1;
    }
    
    @Override
    public String toString() {
        return artist + ": " + name + " (" + publicationYear + ")";
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chunh
 */
import java.util.HashMap;
public class Abbreviations {
    private HashMap<String, String> abbLibrary;
    
    public Abbreviations() {
        this.abbLibrary = new HashMap<>();
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        return this.abbLibrary.containsKey(abbreviation);
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        if (this.hasAbbreviation(abbreviation)) {
            System.out.println("The abbreviation is already in the library!");
        } else {
            this.abbLibrary.put(abbreviation, explanation);
        }
    }
    
    public String findExplanationFor(String abbreviation) {
        return this.abbLibrary.get(abbreviation);
    }
    
}

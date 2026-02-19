

public class Checker {
    public boolean isDayOfWeek(String string) {
        String dayOfWeek = "mon|tue|wed|thu|fri|sat|sun";
        return string.matches(dayOfWeek);
    }
    
    public boolean allVowels(String string) {
        String vowels = "(a|e|i|o|u)*";
        return string.matches(vowels);
    }
    
    public boolean timeOfDay(String string) {
        /*if (string.length() != 8) {
            return false;
        }
        
        int hours;
        
        try {
            hours = Integer.parseInt(string.substring(0,2));
        } catch (NumberFormatException e) {
            return false;
        }
        
        if (hours < 0 || hours > 23) {
            return false;
        }
        
        String mmss = string.substring(2);
        
        String check = ":[0-5][0-9]:[0-5][0-9]";
                
        return mmss.matches(check);*/
        
        return string.matches("([01][0123456789]|2[0123]):[012345][0123456789]:[012345][0123456789]");
    }
}

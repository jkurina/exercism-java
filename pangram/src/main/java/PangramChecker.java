public class PangramChecker {
    public boolean isPangram(String input) {
        
        // Make everything uppercase
        input = input.toUpperCase();
        
        // Check if each letter A-Z appears in the input string
        int counter = 0;
        for ( char a = 'A'; a <= 'Z'; a++ ) {
            if ( input.indexOf(a) < 0 ) {
                return false;
            }
        }
        return true;
    }
}

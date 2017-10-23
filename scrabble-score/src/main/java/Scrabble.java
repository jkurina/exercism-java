import java.util.HashMap;

final class Scrabble {
    
    private String input;
    private final HashMap<Character, Integer> letters = new HashMap<Character, Integer>();
    
    
    Scrabble(String word) {
        
        this.letters.put('A', 1); this.letters.put('E', 1); this.letters.put('I', 1);
        this.letters.put('O', 1); this.letters.put('U', 1); this.letters.put('L', 1); 
        this.letters.put('N', 1); this.letters.put('R', 1); this.letters.put('S', 1); 
        this.letters.put('T', 1);
        
        this.letters.put('D', 2); this.letters.put('G', 2); 
        
        this.letters.put('B', 3); this.letters.put('C', 3); this.letters.put('M', 3); 
        this.letters.put('P', 3); 
        
        this.letters.put('F', 4); this.letters.put('H', 4); this.letters.put('V', 4); 
        this.letters.put('W', 4); this.letters.put('Y', 4); 
        
        this.letters.put('K', 5); 
        
        this.letters.put('J', 8); this.letters.put('X', 8); 
        
        this.letters.put('Q', 10); this.letters.put('Z', 10); 
        
        this.input = word;
    }

    int getScore() {
        int score = 0;
        if ( this.input == null || this.input.trim().isEmpty() ) { 
            return score; 
        } else {
            String word = this.input.toUpperCase();
            char[] chars = word.toCharArray();
            for ( int i = 0; i < chars.length; i++ ) {
                score += this.letters.get( chars[i] );
            }
            return score;
        }
    }
}
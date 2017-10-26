import java.util.*;
class TwelveDays {
    // Two string arrays containing days and gifts.
    // Very tedious. Considered a 2D string array but it wasn't necessary.
    // Maybe a map of sorts could work here.
    private final String[] day = new String[]{
        " first "," second "," third "," fourth "," fifth "," sixth ",
        " seventh "," eighth "," ninth "," tenth "," eleventh "," twelfth "
        };
    private final String[] gift = new String[]{
            " a Partridge in a Pear Tree."," two Turtle Doves,",
            " three French Hens,"," four Calling Birds,",
            " five Gold Rings,"," six Geese-a-Laying,",
            " seven Swans-a-Swimming,"," eight Maids-a-Milking,",
            " nine Ladies Dancing,"," ten Lords-a-Leaping,",
            " eleven Pipers Piping,"," twelve Drummers Drumming,"
        };
    private final String pre = "On the";
    private final String post = "day of Christmas my true love gave to me,";
    
    // First, check if we're singing only the first verse. If we are, there's
    // no "and" in the list of gifts. Use a stringBuilder and iterate through
    // the list of gifts recieved on a given day.
    String verse(int verseNumber) {
        boolean and = (verseNumber > 1);
        verseNumber -= 1;
        StringBuilder sb = new StringBuilder( pre + day[verseNumber] + post );
        
        for (int i = verseNumber; i >= 0; i--) {
            if (and && i == 0) {
                sb.append(" and");
            }
            sb.append(gift[i]);
        }
        sb.append("\n");
        
        return sb.toString();
    }
    
    // Start off the sb with the first verse, increment the startVerse,
    // then use a loop to repeatedly call the verse method and append newlines.
    String verses(int startVerse, int endVerse) {
        String currentVerse = verse(startVerse);
        StringBuilder sb = new StringBuilder(currentVerse);
        startVerse++;
        for (int i = startVerse; i <= endVerse; i++) {
            sb.append("\n");
            currentVerse = verse(i); 
            sb.append(currentVerse);
        }
        
        return sb.toString();
    }
    
    // Full song: Verses 1 through 12.
    String sing() {
        return verses(1,12);
    }
}


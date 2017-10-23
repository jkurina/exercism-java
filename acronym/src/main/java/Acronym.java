import java.util.regex.Pattern;
import java.util.regex.Matcher;

final class Acronym {
    
    static final Pattern regex = Pattern.compile("[A-Z]+[a-z]*|[a-z]+");
    private final String output;

    Acronym(String phrase) {
        StringBuilder sb = new StringBuilder();
        Matcher matcher = regex.matcher(phrase);
        
        while (matcher.find()){
            sb.append(matcher.group().charAt(0));
        }
        
        this.output = sb.toString().toUpperCase();
    }

    String get() {
        return this.output;
    }
}
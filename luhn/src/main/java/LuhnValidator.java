import java.util.*;
import java.util.regex.Pattern;

class LuhnValidator {

    boolean isValid(String candidate) {
        candidate = candidate.replaceAll("[ \t\n\f\r]", "");
        Pattern p = Pattern.compile("[^0-9]");
        Matcher m = p.matcher(candidate);
        char[] candidateArray = candidate.toCharArray();
        int length = candidateArray.length;
        
        if (length <= 1 || m.matches()) {
            return false;
        }
        int sum = 0;
        
        for (int i=0; i < length; i++) {
            int digit = Character.getNumericValue(candidateArray[length-i-1]);
            if (i % 2 == 1) {
               digit *= 2;
            }
            sum += digit > 9 ? digit - 9 : digit;
        }
        
        return sum % 10 == 0;
    }
}

import java.util.*;
import java.util.regex.*;

class LuhnValidator {
    
    // regex pattern that matches any non-numeric characters
    private static Pattern p = Pattern.compile("[^0-9]");

    boolean isValid(String input) {
        // First, remove all whitespace from the input
        String candidate = input.replaceAll("[ \t\n\f\r]", "");
        
        // Use a Matcher to check the input with the pattern p
        Matcher m = this.p.matcher(candidate);
        
        // Create an array containing each char in the string
        char[] candidateArray = candidate.toCharArray();
        
        // Set a variable to hold the length of the char array
        int length = candidateArray.length;
        
        // Failure cases: input length is 1 or less or contains non-digits
        if (length <= 1 || m.matches()) {
            return false;
        }
        
        // Initialize the sum
        int sum = 0;
        
        // Loop through the input, starting from the right-end
        // Multiply every second digit by 2
        // If a digit is greater than 9, subtract 9 from it.
        // Add each digit to the sum
        // Source: https://en.wikipedia.org/wiki/Luhn_algorithm#Java
        for (int i=0; i < length; i++) {
            int digit = Character.getNumericValue(candidateArray[length-i-1]);
            if (i % 2 == 1) {
               digit *= 2;
            }
            sum += digit > 9 ? digit - 9 : digit;
        }
        
        // return a boolean telling us if the sum is divisible by 10
        return sum % 10 == 0;
    }
}
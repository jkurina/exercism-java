import java.util.*;
class NaturalNumber {
    
    // This is shared by the methods
    private final int inputNumber;
    
    NaturalNumber(int input) {
        // Reject all inputs less than or equal to zero and throw an exception
        if (input <= 0) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        this.inputNumber = input;
    }
    
    // Return the classification
    Classification getClassification() {
        // Special case: 1 is considered deficient in spite of its factors adding up perfectly.
        if (inputNumber == 1) {
            return Classification.DEFICIENT;
        }
        
        // Call the sum method to add up the contents of the factor list
        int factorSum = sum(factors(inputNumber));
        
        // Conditional branches to evaluate the result
        if (factorSum < inputNumber) {
            return Classification.DEFICIENT; 
        } else if (factorSum == inputNumber) {
            return Classification.PERFECT;
        } else {
            return Classification.ABUNDANT;
        }
    }

    // Create an ArrayList containing the factors of the input
    static List<Integer> factors(int input) {
        List<Integer> intList = new ArrayList<Integer>();
        // Exclude the input from the list of factors
        for (int i = 1; i < input; i++) {
            if (input % i == 0) {
                intList.add(i);
            }
        }
        return intList;
    }

    // Return a sum of the contents of a list of integers
    static int sum (List<Integer> list) {
        int sum = 0;
        for (int i: list) {
            sum += i;
        }
        return sum;
    }
}

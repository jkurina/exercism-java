class LargestSeriesProductCalculator {
    // Private variables that will be used by this class
    private int[] numArray;
    private int arrayLength;
    private int seriesLength;
    
    LargestSeriesProductCalculator(String inputNumber) throws IllegalArgumentException {
        // Check if the input is a valid string first
        stringValidator(inputNumber);
        // If it's a valid string, set the length private variable
        arrayLength = inputNumber.length();
        // An int[] array is created from the input string
        this.numArray = new int[arrayLength];
        arrayBuilder(inputNumber);
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) throws IllegalArgumentException {
        // Get the illegal cases out of the way: series can't be negative or larger than the length of the input
        if (numberOfDigits > numArray.length) {
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        } else if (numberOfDigits < 0) {
            throw new IllegalArgumentException("Series length must be non-negative.");
        } else if (numberOfDigits == 0) {
            // Trivial case.
            return 1;
        } else {
            // set the private series length variable, initialize the output, count the total number of series
            seriesLength = numberOfDigits;
            long output = 0;
            int totalSeries = (arrayLength - seriesLength);
            // iterate through the array computing the series product for each position
            // check to see if it's bigger than the current max
            for (int i = 0; i <= totalSeries; i++) {
                output = Math.max(output, seriesProduct(i));
            }
            return output;
        }
    }
    
    // Build an int[] array from the input string
    private void arrayBuilder(String input) {
        // loop through the input string, find the numeric value for each character,
        // and set the value into the int[] array at the corresponding index.
        for (int i = 0; i < arrayLength; i++) {
            char c = input.charAt(i);
            numArray[i] = Character.getNumericValue(c);
        }
    }
    
    // Check to see if the input string is valid: can't be null & contain only digits
    private void stringValidator (String input) throws IllegalArgumentException {
        if (input == null) {
            throw new IllegalArgumentException("String to search must be non-null.");
        } else {
             for (int i = 0; i < input.length(); i++) {
                boolean digit = Character.isDigit(input.charAt(i));
                if ( !digit ) {
                    throw new IllegalArgumentException("String to search may only contain digits.");
                }
            }
        }
    }
    
    // return the product of a series starting at a given index value of numArray
    private long seriesProduct(int start) {
        int end = start + seriesLength;
        long product = 1;
        for (int i = start; i < end; i++) {
            product *= numArray[i];
        }
        return product;
    }
    
}

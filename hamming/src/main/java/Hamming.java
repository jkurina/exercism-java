public class Hamming {
    
    private String left;
    private String right;
    private int length;
    
    Hamming(String leftStrand, String rightStrand) {
        if ( leftStrand.length() != rightStrand.length() ) {
            throw new IllegalArgumentException("The Hamming distance is only defined for sequences of equal length.");
        }
        left = leftStrand;
        right = rightStrand;
        length = leftStrand.length();
    }

    int getHammingDistance() {
        int counter = 0;
        for ( int i = 0; i < length; i++ ) {
            if ( left.charAt(i) != right.charAt(i) ) {
                counter++;
            }
        }
        return counter;
    }

}
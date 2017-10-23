import java.util.*;

final class HandshakeCalculator {
    // bitmask to trigger a reversal the output signal
    private static final int REVERSAL_BIT = 4;
    
    List<Signal> calculateHandshake(final int input) {
        // The expected output is an ArrayList of Signal objects. 
        final List<Signal> output = new ArrayList<>();
        
        // For-each Signal object in the 
        for ( final Signal x : Signal.values() ) {
            
            // right shift the input for each signal enum value
            // perform an AND operation to check for the presence of the signal bit
            // if it's present, add the corresponding signal to the output list
            // Signal ordinal values:
            // WINK = 0, DOUBLE_BLINK = 1, CLOSE_YOUR_EYES = 2, JUMP = 3
            if ( ( (input >> x.ordinal()) & 1 ) == 1 ) {
                output.add( x );
            }
        }
        
        // right-shift the input 4 bits and perform an AND operation to check
        // for the presence of the reversal bit. If it's present, reverse the
        // output list.
        if ( ( (input >> REVERSAL_BIT) & 1 ) == 1 ) {
            Collections.reverse( output );
        }
        
        return output;
    }
}
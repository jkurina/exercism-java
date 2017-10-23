import java.util.*;
class SumOfMultiples {
    
    private int theNumber;
    private List<Integer> theMultiples;
    
    SumOfMultiples(int number, int[] set) {
        // Set the upper-limit
        this.theNumber = number;
        
        // Create a list to hold all of the multiples of the set members
        List<Integer> allMultiples = new ArrayList<Integer>();
        
        // For each member of the set, add the output of the multitples method
        // to our list of multiples
        for (int i : set) {
            allMultiples.addAll(multiples(i));
        }
        
        // Get rid of duplicates, turn list of multiples into a hash set
        Set<Integer> listToSet = new HashSet<Integer>(allMultiples);
        
        // Add all of the members of the hash set to the private list of multiples
        this.theMultiples = new ArrayList<Integer>(listToSet);
    }

    // add all of the members of the private list together
    int getSum() {
        int sum = 0;
        for (int i : this.theMultiples) {
            sum += i;
        }
        return sum;
    }
    
    // Create an ArrayList containing the multiples of the input
    List<Integer> multiples(int input) {
        List<Integer> intList = new ArrayList<Integer>();
        for (int i = input; i < theNumber; i++) {
            if (i % input == 0) {
                intList.add(i);
            }
        }
        return intList;
    }
}

import java.util.*;

class Sieve {
    // Private variables needed: Maximum prime value, a list to store primes,
    // and a class iterator 
    private int maxPrime;
    private List<Integer> primeList = new ArrayList<Integer>();
    private Iterator<Integer> iterator;
    
    // Recieves the maximum prime value, creates an iterator over the 
    // range [2,maxPrime], and builds a list of primes in that range.
    public Sieve(int input) {
        this.maxPrime = input;
        iteratorBuilder();
        primeListBuilder();
    }
    
    // Returns the list of primes
    public List<Integer> getPrimes() {
        return primeList;
    }
    
    // Builds an iterator over the range [2,maxPrime]
    private void iteratorBuilder() {
        List<Integer> numberList = new ArrayList<Integer>();
        for (int i = 2; i <= maxPrime; i++) {
            numberList.add(i);
        }
        this.iterator = numberList.iterator();
    }
    
    // iterates through the range collecting primes and marks their multiples
    private void primeListBuilder() {
        int prime;
        while ( iterator.hasNext() ) {
            prime = iterator.next();
            primeList.add(prime);
            multipleMarker(prime);
        }
    }
    
    // instantiates a new list containing all the numbers in the range of the 
    // iterator that are not multiples of the input value. the resulting list
    // is then used to create a new class-iterator that doesn't contain multiples
    // of the input value.
    private void multipleMarker(int input) {
        List<Integer> replacement = new ArrayList<Integer>();
        int value;
        while ( iterator.hasNext() ) {
            value = iterator.next();
            if ( value % input != 0 ) {
                replacement.add(value);
            }
        }
        this.iterator = replacement.iterator();
    }
}
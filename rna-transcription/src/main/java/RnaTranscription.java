public class RnaTranscription {
    public String transcribe( String dna ) {
        // First check the empty case
        if ( dna.isEmpty() ) {
            return dna;
        } else {
            // Make the letters uppercase and break the string into chars
            char[] rna = dna.toUpperCase().toCharArray();
            // Loop through the array of chars and run the swap method on each
            for ( int i = 0; i < rna.length; i++ ) {
                rna[i] = swapper(rna[i]);   
            }
            // Turn the char array back into a String and return it
            return new String(rna);
        }
    }

    // Accepts DNA Nucleotide and returns corresponding RNA Nucleotide
    public char swapper( char dna ) {
        char rna = dna;
        switch ( dna ) {
            case 'G': rna = 'C';
                break;
            case 'C': rna = 'G';
                break;
            case 'T': rna = 'A';
                break;
            case 'A': rna = 'U';
                break;
            default: break;
        }
        return rna;
    }
}
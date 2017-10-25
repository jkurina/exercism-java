//Rev. 2: got rid of the try/catch format to simplify the program.
//Rev. 3: used a ternary operator to further simplify the program.
//Rev. 4: took out the import statement and simplified the method to one line.
public class Twofer {
    public String twofer(String input) {
        return String.format( "One for %s, one for me.", input != null ? input : "you" );
    }
}
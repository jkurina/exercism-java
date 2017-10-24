//Rev. 2: got rid of the try/catch format to simplify the program.
//Rev. 3: used a ternary operator to further simplify the program.
import java.io.*;
public class Twofer {
    public String twofer(String input) {
        String name = input == null ? "you" : input;
        return "One for " + name + ", one for me.";
    }
}
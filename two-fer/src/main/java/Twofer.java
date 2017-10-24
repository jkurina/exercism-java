//Rev. 2: got rid of the try/catch format to simplify the program.
import java.io.*;
public class Twofer {
    public String twofer(String name) {
        if (name == null) {
            name = "you";
        }
        return "One for " + name + ", one for me.";
    }
}
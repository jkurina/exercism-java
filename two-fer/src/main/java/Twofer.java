import java.io.*;

public class Twofer {
    public String twofer(String name) {
        try {
            if (name.length() < 0) {
                name = "you";
            }
            return "One for " + name + ", one for me.";
        } catch (NullPointerException e) {
            return "One for you, one for me.";
        }
    }
}
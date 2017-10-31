class RotationalCipher {
    // the shift value will be needed by several methods in the class
    private int shift;

    public RotationalCipher(int input) {
        this.shift = input;
    }
    
    // creates a char array from the input message, loops through it,
    // changes all characters with their shifted values, and returns 
    // the encoded message.
    public String rotate(String input) {
        char[] message = input.toCharArray();
        for (int i = 0; i < message.length; i++) {
            char c = message[i];
            if (Character.isLowerCase(c)) {
                message[i] = lcShift(c);
            } else if (Character.isUpperCase(c)) {
                message[i] = ucShift(c);
            } else {
                message[i] = c;
            }
        }
        return new String(message);
    }
    
    // shifts lower-case characters
    private char lcShift(char input) {
        char start = (char)('a' - 1);
        char end = 'z';
        char output = (char)(input + shift);
        if (output > end) {
            output = (char)((start) + (output % end));
        }
        return output;
    }
    
    // shifts upper-case characters
    private char ucShift(char input) {
        char start = (char)('A' - 1);
        char end = 'Z';
        char output = (char)(input + shift);
        if (output > end) {
            output = (char)((start) + (output % end));
        }
        return output;
    }
    
}
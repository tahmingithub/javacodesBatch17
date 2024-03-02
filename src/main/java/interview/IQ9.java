package interview;

public class IQ9 {
     /*
        Find the First Non-Repeating Character in a String: Given a string,
    find and return the first non-repeating character. For example, in the
    string "abracadabra", the first non-repeating character is 'c'.
         */
    public static char firstNonRepeatingChar(String input) {
        for (char c : input.toCharArray()) {
            if (input.indexOf(c) == input.lastIndexOf(c)) {
                return c;
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        String input = "abracadabra";
        char result = firstNonRepeatingChar(input);
        if (result != ' ') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found in the string.");
        }
    }

}


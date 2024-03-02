package interview;

public class IQ6 {
    public static void main(String[] args) {


    /*
        Check if a String is Palindrome: Determine whether a given string is
    a palindrome, which means it reads the same forwards and
    backward. For example, "madam" is a palindrome
         */
        String word = "noon";
        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);

        }
        if (word.equals(reverse)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("Its not a palindrome");
        }
        System.out.println("*******");

        //Easy way


        String Name = "Madam";      // polindrome=> means the same backward
        for (int j = Name.length() - 1; j >= 0; j--) {
            if (Name.equals(Name)) {
                System.out.println("This is not polindrome");
            } else {
                System.out.println("This is polindrome");
            }
        }
    }
}




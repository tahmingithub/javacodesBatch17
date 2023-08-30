package class11;

public class T2StringMethod {
    public static void main(String[] args) {
/*
        2:   create a String and print it in reverse order (sunday--->yadnuS).
        */
        String str = "Sunday";
        for (int i = str.length() - 1; i >= 0; i--) {    // last index always 1 less than length
            System.out.print(str.charAt(i));


            // String str="Sunday";
            //  String reversed= "";
            //for (int i= str.length()-1 ; i>=0; i--) {    // last index always 1 less than length
            // reversed=reversed+str.charAt(i);
            //  }
            //  System.out.println(reversed);

        }
    }
}
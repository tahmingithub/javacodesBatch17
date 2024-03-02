package class11;

public class T2StringMethod {
    public static void main(String[] args) {
/*
        2:   create a String and print it in reverse order (sunday--->yadnuS).
        */   //1st way
       // String str = "Sunday";
        //for (int i = str.length() - 1; i >= 0; i--) {    // last index always 1 less than length
          //  System.out.print(str.charAt(i));
           // System.out.println("======")
        // 2nd way
            /* String str="Sunday";
             String reversed= " ";
            for (int i= str.length()-1 ; i>=0; i--) {    // last index always 1 less than length
            reversed=reversed+str.charAt(i);
              }
             * System.out.println(reversed);
       */ System.out.println("*********");


       String name = "Tahmin";
       String reversed= " ";
        for (int i = name.length()-1; i >=0 ; i--) {
            reversed= reversed +name.charAt(i);

        }

        System.out.println(reversed);
        }
    }

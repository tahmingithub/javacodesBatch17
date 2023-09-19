package class11;

public class T1StringMethod {
    public static void main(String[] args) {
        /* 1: Create a String and if the String is not empty perform the following:
        //- if the String has an odd number of characters and has 3 or more characters,
        print the character in the middle of the String.
        for Example String st=hello=>l
        2:   create a String and print it in reverse order (sunday--->yadnuS).
        */
        String str="hello";
            if(str.length()%2!=0&&str.length()>=3){
                int middle=str.length()/2;                 // 5/2= 2   , int cant be decimal, thus 5/2=2
                System.out.println(str.charAt(middle));      // total length of character is 5
        }

    }
}

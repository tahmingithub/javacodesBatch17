package interview;

public class IQ1 {
    public static void main(String[] args) {


        // Write a program to swap(exchange)  2 numbers without a temporary variable? swap 2 strings without
        // a temporary variable.

       int a=10;    //swap number
       int b=20;
        a=a+b;  // a=10+20=30;
        b=a-b; // 30-20=10;
        a=a-b; // 30-10=20;
        System.out.println(a);
        System.out.println(b);
        System.out.println("*********");



        // confuse the string part
        String x="Hello";
        String y="Welcome";
        x=x+y; //Hellowelcome
        y=x.substring(0,(x).length()-y.length());
        x=x.substring(y.length());
        System.out.println(x);
        System.out.println(y);





        }
    }
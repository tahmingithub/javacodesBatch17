package interview;

public class IQ4 {
    public static void main(String[] args) {

        /*
        Write a program to swap 2 String without a temporary variable?
         */



            String a = "Tahmin";
            String b="kabulzad";

            System.out.println("Before swapping: ");
            System.out.println("a = "+a);
            System.out.println("b = "+b);
            System.out.println("******");
            a=a+b;
            b=a.substring(0,a.length()-b.length());
            a=a.substring(b.length());

            System.out.println("After swapping: ");
            System.out.println("a = " +a);
            System.out.println("b = " +b);

            System.out.println("*************************");

        }
}

package class29;

public class E6 {
    public static void main(String[] args) {

        System.out.println("1");

        try {    //if
             //inside try we place the code that might throw an exception(run time error)
            // System.out.println(10/0);   // it print the ArithmeticException
            /*String name=null;     // it prints the NullPointException
            name.length();*/
            int[] arr = new int[-5]; // it prints the exception
        } catch (ArithmeticException e) {   // else
            System.out.println("Don't divide by zero");

        } catch (NullPointerException e) {  // else
            System.out.println("Check if you stored the null value in the variable");

        } catch (Exception e) {         // exception is parent class of all error    // else if
            System.out.println("Something went wrong");
        }


    }

}





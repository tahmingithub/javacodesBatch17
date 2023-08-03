package class4;

import java.util.Scanner;

public class E7Scanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter full name ");
        String name =scanner.nextLine();
        /// nextLine() ->if  you want to  put full name.  if it is .next() only first name will be  print
        System.out.println("Your full name is " + name);


    }
}

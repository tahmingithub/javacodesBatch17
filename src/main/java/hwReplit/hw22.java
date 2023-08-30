package hwReplit;

import java.util.Scanner;

public class hw22 {

        public static void main(String[] args){

            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter your name");
            String name =scanner.next();
            System.out.println("Enter your mobile number");

            String mobileNumber=scanner.next();
            System.out.println("Enter your age");
            int age=scanner.nextInt();
            System.out.println("Your name is " +name+","+" your age is " + age + " and your mobile nummber is " + mobileNumber);

        }
}





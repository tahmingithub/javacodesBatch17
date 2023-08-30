package class4;

import java.util.Scanner;

public class E4Scanner {
    public static void main(String[] args) {

        System.out.println("Please Enter your name");
        // creating the object of the scanner class so that we can reuse the logic
        //from this lass which is already written for us by java developer
        Scanner input=new Scanner(System.in);
        // taking an input from the user and storing in into a name variable
        String name= input.next();
        if (name.equals("khan")){
            System.out.println("Java instructor");
        }else{
            System.out.println("I dont know you");
        }
       // System.out.println("Hello "+ name);



    }
}

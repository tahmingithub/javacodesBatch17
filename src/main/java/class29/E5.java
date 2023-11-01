package class29;

import java.util.Scanner;

public class E5 {         // the code that gives problem , we put it inside try {
    public static void main(String[] args) {

        System.out.println("1");
        System.out.println("1"); 
        System.out.println("1");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the size of the array");
        try {  // it is like if and else if condition, try=> try  the code and if it worked, continue the rest of code
            //plan A
            int size = scanner.nextInt();
            int[] ali = new int[size];
        }catch (Exception v){ //e=> variable,else if, catch=> if the code fails, get exception and print plan B
            //Plans B
            System.out.println("Something went wrong please contact support ");
        }

        System.out.println("2");
        System.out.println("3");
        System.out.println("4");


    }
    }

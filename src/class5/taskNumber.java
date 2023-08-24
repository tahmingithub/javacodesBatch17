package class5;

import java.util.Scanner;

public class taskNumber {
    public static void main(String[] args) {
   /* Ask user to enter a number and then define if number is small, medium or large.
   Small  number is value between 1 and 10
   Medium number is value between 11 and 100
   Large number is value between 1001 and 1000
    */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter a number");
        int number=scanner.nextInt();

        if (number>=1&&number<=10){
            System.out.println("Small");
        }else if(number>=11&&number<=100){
            System.out.println("medium");
        }else if (number>=101&&number<=1000){
            System.out.println("Large");
        }else{
            System.out.println("invalid");
        }


    }
}

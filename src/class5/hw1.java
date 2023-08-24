package class5;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {

        /*  Write a program that will ask user to input inputs the current time (use 24 hour format).
Based on the given time define:
if hour is between 1-11 --> Morning
if hour between 12-15 --> Afternoon
if hour between 16-20 --> Evening
if hour between 21-24 --> Night
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the hour");
        int time=scanner.nextInt();
        if(time>=1&&time<=11){
            System.out.println("Morning");
        }else if(time>=12&&time<=15){
            System.out.println("Afternoon");
        }else if(time>=16&&time<=20){
            System.out.println("Evening");
        }else if(time>=21&&time>=24){
            System.out.println("Night");
        }else{
            System.out.println("Invalid Timing");
        }

    }
}

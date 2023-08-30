package class5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in March, April, May → season =”Spring”
if user is born in June, July, August →
season =”Summer”  etc …
At the end of the program we should see 1 output as “You were born is season __”.
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter birth month");
        String birthMonth= scanner.next();
        if (birthMonth.equals("March")||birthMonth.equals("April")||birthMonth.equals("May")){
            System.out.println("You were born on Spring");
        }else if (birthMonth.equals("June")||birthMonth.equals("July")||birthMonth.equals("August")){
            System.out.println("you were born on Summer");
        }else if (birthMonth.equals("September")||birthMonth.equals("October")||birthMonth.equals("November")){
            System.out.println("You were born on Autumn");
        }else{
            System.out.println("You were born is season Winter");
        }

    }
}

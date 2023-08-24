package class5;

import java.util.Scanner;

public class Task1Instructor {
    public static void main(String[] args) {// < upper case m lowercase

/*

        Write a program for user to enter his/hers birth month. Based on the month define the season.
                Example: if user is born in March, April, May → season =”Spring”
        if user is born in June, July, August →
        season =”Summer”  etc …
        At the end of the program we should see 1 output as “You were born is season __”.
         */

        Scanner scanner=new Scanner(System.in);
        String birthMonth= scanner.next();
        if(birthMonth.equalsIgnoreCase("March")||
                birthMonth.equalsIgnoreCase("Apr")||
                birthMonth.equalsIgnoreCase("May")){
            System.out.println("Spring");
        }else if (birthMonth.equalsIgnoreCase("June")||
                birthMonth.equalsIgnoreCase("July")||
                birthMonth.equalsIgnoreCase("August")){
            System.out.println("Summer");

        }

    }
}

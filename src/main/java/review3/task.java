package review3;

import java.util.Scanner;

public class task {
    public static void main(String[] args) {
/*
Ask the user to input two boolean values (true or false).
Use the logical AND operator (&&) to determine if both are true.
Display the result to the user.
 */    Scanner scanner=new Scanner(System.in);
        System.out.println("Do you workout true/false");
        boolean workout=scanner.nextBoolean();

        System.out.println(" are you in diet");
        boolean diet=scanner.nextBoolean();

        if(workout&&diet){
            System.out.println("Healthy");
        } else{
            System.out.println("notHealthy");
        }
    }
}

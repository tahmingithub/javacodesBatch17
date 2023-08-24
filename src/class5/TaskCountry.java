package class5;

import java.util.Scanner;
/*
Ask user to enter their country and capture it.
Once values are captured print which language user speaks.
 */
public class TaskCountry {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your country");
        String country=scanner.nextLine();
        country=country.toLowerCase();
        switch(country){
            case"canada":
                System.out.println("French");
                break;
            case"afghanistan":
                System.out.println("farsi");
                break;
            case "Uk":
                System.out.println("English");
                break;
            default:
                System.out.println("wrong country");
        }


    }
}

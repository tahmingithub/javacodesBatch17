package class4;

import java.util.Scanner;

public class hw3ConvertFarhtoC {
    public static void main(String[] args) {
/* Create a Java program that will ask user to input city and temperature.
Your program should convert Fahrenheit into celsius and print “The temperature is the city  is ”
 */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter city name");

        String city= scanner.next();
        System.out.println("please enter your city temperature in fahrenheit");
        double temperature= scanner.nextInt();
        double convertFTOC= (temperature-30)*5/9; //conversion formula
        System.out.println("The temperature of your city is " +convertFTOC );
    }
}


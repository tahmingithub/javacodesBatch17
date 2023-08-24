package review4;

import java.util.Arrays;
import java.util.Scanner;

public class E9Arrays {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the  size of  the Arrays");
        int size=scanner.nextInt();
        int numbers[]=new int[size];

        for (int i = 0; i <numbers.length ; i++) {
            System.out.println("Enter the number" );
            numbers[i]=scanner.nextInt();

        }
        System.out.println("You enters these numbers");
        System.out.println(Arrays.toString(numbers));
    }
}

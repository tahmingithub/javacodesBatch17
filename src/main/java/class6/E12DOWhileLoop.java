package class6;

import java.util.Scanner;

public class E12DOWhileLoop {
    public static void main(String[] args) {


                Scanner scanner=new Scanner(System.in);
                int input;
                do {
                    System.out.println("enter a number or -1 to terminate");
                    input=scanner.nextInt();
                    System.out.println("You have entered " + input);
                } while(input!=-1);


            }
        }


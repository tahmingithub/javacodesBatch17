package class4;

import java.util.Scanner;

public class E8Scanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your name ");
        String name = scanner.next();
        if (name.equals("Jamel")){
            System.out.println("Senior SDET");
        }else if (name.equals("Aysha")) {
            System.out.println("I live in Canada");
        }else if (name.equals("Habib")) {
            System.out.println("Jailed by wife");
        } else if (name.equals("Laura")) {
            System.out.println("Stop the dad jokes, please!");
        }

    }
}

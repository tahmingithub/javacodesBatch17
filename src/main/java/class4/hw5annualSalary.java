package class4;

import java.util.Scanner;

public class hw5annualSalary {
    public static void main(String[] args) {
        /*

Write a  program to ask user to enter numbers of worked years and annual salary.
If user worked for more or equals to 5 years than user is eligible for the bonus,
otherwise he is not. Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write numbers of worked years ");
        int workedYears = scanner.nextInt();
        System.out.println("write the numbers of annual salary");
        double annualSalary = scanner.nextDouble();

        if (workedYears >= 5) {
            System.out.println("User eligible for bonus");

            if (annualSalary > 5000) {
                System.out.println("bonus=5000");
            } else
                System.out.println("bonus =3000");
        } else
            System.out.println("not eligible for bonus");


    }

    }

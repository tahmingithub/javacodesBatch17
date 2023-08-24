package class5;

import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {

       /*
        Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/).
        Based on operator provide the result to user.
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = scanner.nextInt();
        System.out.println("Enter num2");
        int num2 = scanner.nextInt();
        System.out.println("Enter Operator (+,-,*,?");
        char op = scanner.next().charAt(0);//


        if (op == '+') {
            System.out.println(num1 + num2);
        } else if (op == '-') {
            System.out.println(num1 - num2);
        } else if (op == '-') {
            System.out.println(num1 + num2);
        } else if (op == '*') {
            System.out.println(num1 * num2);
        } else if (op == '/') {
            System.out.println(num1/num2);
        } else {
            System.out.println("Wrong data");

        }
    }
}
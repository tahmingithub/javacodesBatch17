package class5;

import java.util.Scanner;
public class hw5 {
    public static void main(String[] args) {
       /*
        Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/).
        Based on operator provide the result to user.
        */
        //      using switch  case
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = scanner.nextInt();
        System.out.println("Enter num2");
        int num2 = scanner.nextInt();
        System.out.println("Enter Operator (+,-,*,?");
        char op = scanner.next().charAt(0);//

        switch (op) {
            case '+':
                System.out.println(num1+num2);
                break;
            case'-':
                System.out.println(num1-num2);
                break;
            case '*' :
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("Wrong data");

        }

    }
}

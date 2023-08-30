package class12;

import java.util.Scanner;

public class Calculator {
    // for package we dont need to have import but for class we need to have import
    // thats why we have import here
    // we define the method
    void add() {      // { =>body of method           // creating method  / add=> name of method ex: my name is tahmin
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter first number");
        int num1 = scanner.nextInt();
        System.out.println("please enter second number");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("sum of these numbers is " + sum);

    }

    void subtract() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter first number");
        int num1 = scanner.nextInt();
        System.out.println("please enter second number");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("Subtraction of these numbers is " + sum);
    }
        void multiply(int number1, int number2){  // parameters inside the ()
int result=number1*number2;
            System.out.println(result);
        }


    }



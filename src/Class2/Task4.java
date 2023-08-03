package Class2;

public class Task4 {
    public static void main(String[] args) {

        //
        // /* 1: Write a java program to add, subtract, multiply and divide 2 decimal values
        //     your program should say
        //     " The ---- of two numbers--- and -- is equal to ----"
        //     2:Write a program to find the square of the number 3.9. your program should say "The square of the --- is ---.
        //     3: write a program to print the area and perimeter of a rectangle with width=5 and height =8.
        //     your program should say. "The perimeter o a rectangle with width--- and height---
        //     is equal to -- and the ara is --."
        //    /*
        //      */
        //
       double num1=21.0;
       double num2=5.5;
       double num3=4;
       double num4=6;

       double addResults=num1+num2;
       double subResults=num1-num2;
       double mulResults=num1*num2;
       double divResults=num1/num2;

        System.out.println("The addition of two numbers " + num1+" and " + num2+ " is equal to "  +addResults);
        System.out.println("The subtraction  of two numbers " + num1+" and " + num2+ " is equal to "  +subResults);
        System.out.println("The multiplication of two numbers " + num1+" and " + num2+ " is equal to "  +mulResults);
        System.out.println("The division of two numbers " + num1+" and " + num2+ " is equal to "  +divResults);



    }
}

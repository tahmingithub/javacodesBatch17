package class19;

public class Calculator {

    public void add(int num1, int num2) { //add(int num1,num2)
        System.out.println(1);                 // name of method plus its parameters=>called signature of method
        System.out.println(num1 + num2);
    }

    public void add(int num1, int num2, int num3) {// called header of method, the whole method is called header of method
        System.out.println(2);
        System.out.println(num1 + num2 + num3);
    }

    public void add(double num1, double num2) {
        System.out.println(3);
        System.out.println(num1 + num2);
    }

    public void add(int num1, double num2) {
        System.out.println(4);
        System.out.println(num1 + num2);
    }

    public void add(double num1, int num2) {
        System.out.println(5);
        System.out.println(num1 + num2);
    }
}
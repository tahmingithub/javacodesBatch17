package class19;
public class Task {
    /*Create a method to find the minimum of two numbers. Method will be passed two
    numbers. Method will be passed two parameters and will return the minimum
    number. Method should work with int and double data types .
    ex: min(10,5)=>5
        min(2.5,3.5)=>2.5     // this is overload method
   */
    public  int min(int num1, int num2) {   // method that hs 2 parameter and we find the min.
        // return num1<num2? num1:num2;  ternary operator
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }
    public double min(double num1, double num2) {
        // return num1<num2? num1:num2;  ternary operator
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }
}

package interview;

import class14.T3;

public class IQQ {
    public static void main(String[] args) {
        /*
Create a method that will take a String as a parameter and returns
reversed String. Method should be available to all classes within your project
and accessible by class name.
 */

        System.out.println(T3.reverseStr("Hello"));
    }
    public static String reverseStr(String inputStr){

        String reversed="";
        for (int i = inputStr.length()-1; i>=0 ; i--) {
            reversed=reversed+inputStr.charAt(i);
        }
        return reversed;
    }
}


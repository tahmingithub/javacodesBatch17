package class24;

import java.util.ArrayList;

public class E4ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer>numbers= new ArrayList<>();// get element from this arraylist
        numbers.add(10);
        numbers.add(20);
        numbers.add(25);
        numbers.add(100);
        numbers.add(5);
       System.out.println(numbers);
        int sum=0;
       for(Integer n: numbers)   {   //  Integer datatype, n variable , numbers

           sum+=n;  // sum=sum+n   // shorthand operator
       }
        System.out.println(sum);
    }

}

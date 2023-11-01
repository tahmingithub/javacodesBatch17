package class24;

import java.util.ArrayList;

public class E3ArrayList {
    public static void main(String[] args) { // for every primitive datatype java create class which is Integer
        //   primitive datatype does not work  with collection framework.
        // String works with collective framework.

        ArrayList<Integer> numbers=new ArrayList<>();  //  int is datatype, it doesnt work with collective framework
        Integer num1=new Integer(10);            // thus  java create class Interger instead of int.
        Integer num2=new Integer(20);     // Integer is class in here
        System.out.println(num1+num2);

        String s="jamel";
        String d=new String("jamel");
        Integer num3=45;
        Integer num4=50;
        System.out.println(num3+num4);

    }
}

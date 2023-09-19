package class23;

import java.util.ArrayList;
import java.util.Scanner;

public class E3ArrayList {

    public static void main(String[] args) {

        ArrayList arr = new ArrayList();
        String str = "Ehab";
        arr.add(str);
        Integer i = new Integer(22);
        arr.add(i);
        Scanner s = new Scanner(System.in);
        arr.add(s);

        checkPrint(arr);
    }

    static void checkPrint(ArrayList arr) {   // method

        for (Object v : arr) {// object => datatype , v=> variable , arr => variable from arraylist
            String str = (String) v; // we convert array to string that is why we add (string ) next to v.
            System.out.println(str.length());
        }
    }
}
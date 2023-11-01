package class25;

import java.util.ArrayList;
import java.util.HashSet;

public class E1Sets {
    public static void main(String[] args) {
           // sets is a data structure that does not allow duplicated values

        ArrayList<Integer> numbers=new ArrayList<>();
        // We can store duplicates in an ArrayList or LinkedList
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        System.out.println(numbers);

        HashSet<Integer> uniqNumbers=new HashSet<>();
        uniqNumbers.add(10);
        uniqNumbers.add(20);
        // uniqNumbers.add(10);
        // uniqNumbers.add(10);
        System.out.println(uniqNumbers);
    }
}



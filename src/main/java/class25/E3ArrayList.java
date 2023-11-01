package class25;

import java.util.LinkedList;
import java.util.List;

public class E3ArrayList {
    public static void main(String[] args) {
        // linkList => is nothing just   different way storing data inside computer
                         // easy to add and remove -> linkedList ,      easy to access elements=? arraylist

        List<Integer> numbers=new LinkedList<>();// list is  parent class for linkedList  and arrylist
        numbers.add(10);                        // list is interface class , collection is parent.
        numbers.add(15);
        numbers.add(20);
        numbers.add(30);
        numbers.add(50);
        System.out.println(numbers);
        numbers.remove(2);
        System.out.println(numbers);
        numbers.removeIf(x->x>15);
        System.out.println(numbers);





    }
}

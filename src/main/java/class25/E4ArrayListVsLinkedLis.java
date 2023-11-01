package class25;

import java.util.LinkedList;

public class E4ArrayListVsLinkedLis {
    public static void main(String[] args) {
        //
                 // overloading method
        long startingTime=System.currentTimeMillis();

        LinkedList<Integer> numbers=new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            numbers.add(0,i);
        }

        long endTime=System.currentTimeMillis();
        long timeTook=(endTime-startingTime);
        System.out.println(timeTook);
                          // when ever we have to perform operations, for shifting arrylist is bad , it takes time

    }
}

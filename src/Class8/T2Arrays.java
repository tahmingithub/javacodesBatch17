package Class8;

public class T2Arrays {
    public static void main(String[] args) {

        // count how many true values are present in array.
        boolean [] conds={true,false,true, false ,true,true};
        int count=0;
        for (int i = 0; i <conds.length ; i++) {
            if(conds[i]){            // if condition is true , count will be increment, otherwise if cond is false,
                                         // count does not increment ,  count stay the same .
                count++;
            }

        }
        System.out.println(count);




    }
}

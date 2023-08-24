package class7;

public class T3NestedLoops {
    public static void main(String[] args) {
    /*        1 2  4 5 6        // same task as task2 but replaced with while loop.
              1 2  4 5 6
              1 2  4 5 6
              1 2  4 5 6
              */
        int i = 0;
        while (i <4) {
            int j = 1;
            while (j < 7) {
                if(j!=3){
                    System.out.print(j+" ");}
                j++;
            }

            System.out.println();
            i++;
        }
        System.out.println("==========");

      }
    }




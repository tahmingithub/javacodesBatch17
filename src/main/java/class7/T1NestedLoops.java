package class7;

public class T1NestedLoops {
    public static void main(String[] args) {
          /*  1 2 3 4 5 6
              1 2 3 4 5 6
              1 2 3 4 5 6
              1 2 3 4 5 6
              */

        for (int i = 0; i < 4; i++) {     //outer row is 4
            for (int j = 1; j < 7; j++) {      // first it print inner then outer
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
    }
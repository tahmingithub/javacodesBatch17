package class9;

import java.util.Arrays;

public class E92D {
    public static void main(String[] args) {
        String[][] names =
                {       {"Hind", "Mikhail", "Ismael", "Ahmed" },
                        {"John", "Bob", "Adam", "Tamim" },
                        {"Joke", "Laugh", "John Ahmed", "Mohammad" },
                        {"Gui", "Backend", "Front", "API" }

                };

        for(String [] row:names){    // outer loop row
            for(String v:row){      // inner loop column
                System.out.print(v+" ");
            }
            System.out.println();
        }
      System.out.println(Arrays.deepToString(names)); // for printing 2D arrays
    }
}

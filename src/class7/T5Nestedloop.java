package class7;

public class T5Nestedloop {
    public static void main(String[] args) {
          /*
        ######
        ##  ##     // hint :  in this row i=2   , j= 3 and 4
        ##  ##
        ######
 */
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i==2&&j==3||i==3&& j==3||i==2&&j==4||i==3&&j==4) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();

        }
    }
}

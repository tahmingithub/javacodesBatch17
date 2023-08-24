package class9;

public class E62D {
    public static void main(String[] args) {
        int[][] numbers = {
                {10, 20, 30, 40},
                {15, 30, 35, 45},
                {16, 20, 32, 22}};

        for (int row = 0; row <numbers.length ; row++) {
        System.out.println(numbers[0][row]);
        }

        System.out.println();
        for (int i = 0; i <3 ; i++) {
            System.out.println(numbers[1][i]);  // always first [] row and [] is column// in here row 1 is constant
            //row change
        }
    }
}



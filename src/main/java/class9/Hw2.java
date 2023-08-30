package class9;

public class Hw2 {
    public static void main(String[] args) {
        /*   Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
         Print the sum of all numbers.
         */
      int [][] numbers={
              {2,6,8,},
              {20,10,44},
              {60,12,55} };

              int sum=0;

        for (int row = 0; row <numbers.length ; row++) {
            for (int col = 0; col<numbers[row].length ; col++) {
                sum=sum+numbers[row][col];
            }

        }
        System.out.println(sum);
    }
}

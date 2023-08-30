package class9;

public class T12D {
    public static void main(String[] args) {
// print only even numbers from this Array
        int[][] numbers = {
                {10, 20, 30, 40},
                {15, 30, 35, 45},
                {116, 20, 32, 22}};

        for (int row = 0; row < numbers.length; row++) {   // numbers.length is =row length which is 3 row
            for (int col = 0; col < numbers[row].length; col++) {  //numbers[row].length= column number which is 4 column
                if (numbers[row][col] % 2==0) {        //  if(numbers [row][col]%2!==0)  it print odd numbers
                    System.out.print(numbers[row][col] + " ");
                }
            }
            System.out.println();
        }

    }
}
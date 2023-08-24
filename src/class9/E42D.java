package class9;

public class E42D {
    public static void main(String[] args) {
        int [][] numbers={
                {10,20,30,40},    //we have  3 row  and 4 columns here , but we have 2 index row and 3 index column
                {15,30,35,45},
                {116,20,32,22}};

        for (int row = 0; row <numbers.length ; row++) {   // we have 3 row
            for (int col = 0; col <numbers[row].length ; col++) { //we have 4 column//numbers[row] means the complete 1D array
                System.out.print(numbers[row][col]+ " ");
            }
            System.out.println();
        }
    }

}

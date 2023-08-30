package review5;

public class twoDarray {
    public static void main(String[] args) {
                               // [row][colum]
        int [][] array= new int [2][4]; //    row , column
        // 1 row
        array[0][0]=12;
        array[0][1]=13;
        array[0][2]=14;
        array[0][3]=15;
        //  2 row
        array[1][1]=1;
        array[1][0]=2;
        array[1][2]=3;
        array[1][3]=4;
        System.out.println(array[0][3]);

        // how ot get all elements from 2D array?
//  array.lenght in 2d array teturn number of rows   // array.length  it tell the number of row which is 2
        // array[row].length in 2D array return number of column from that row
        for (int row =0; row<array.length; row++)  {   // outer loop iterates over rows
           for(int col=0; col<array[row].length;col++) {   // inner loop iterates over colum
               System.out.print(array[row][col]);
        }

        }
    }


}

package class9;

public class HW1 {
    public static void main(String[] args) {

        /* Using 2D array create a grocery list.
         Inside you should have an array of veggies, fruits, dairy and sweets.
         Retrieve all values from that array using 2 different loops
         */
        String [][] grocery=
        {       {"tomatto","patato","okra"},
                {"apple","banana","mango"},
                {"milk","cheese","egg"},
                {"candy","marshmallow","kitkat"}
        };
        for (String []row:grocery){   // using enhanced Loop
            for(String column:row){
                System.out.print(column+" ");
            }
            System.out.println();
        }
        System.out.println("============================");
        for (int i = 0; i <grocery.length; i++) {
            for (int j = 0; j <grocery[i].length ; j++) {
                System.out.print(grocery[i][j]+" ");
            }
            System.out.println();
        }
    }
}

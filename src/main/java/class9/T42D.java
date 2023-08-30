package class9;

public class T42D {
    public static void main(String[] args) {
        // create 2D array of cars: american,german, korean, italian.
        // then retrieve all values from that array using 2 different loops.
        String [][] cars={
                { "Ford","Lincoln","Tesla"},
                { "MB","BMW","Audi"},
                { "Hyundai","KIA","Genesis"},
                {"Ferrari","Lam","Fiat"}
        };
        for (String[] r:cars) {  //  using enhanced for loop
            for(String C: r){

            System.out.print(C+ " ");
        }
            System.out.println();
        }
        System.out.println("==============");
        for (int i = 0; i < cars.length; i++) {   // using for loop
            for (int j = 0; j <cars[i].length ; j++) {
                System.out.print(cars[i][j]+ " ");
            }
            System.out.println();
        }








    }
}

package class9;

public class HW4 {
    public static void main(String[] args) {
        /*
   Create 2D array of countries: north america countries, south america countries,
   europe countries, asian countries, african countries.
   Then print all values from that array using 2 different loops and calculate how many total countries been stored.
         */
        String[][] countries={
                {"Canada",      "USA",      "Mexico" },
                { "Argentina",  "Bolivia",  "Brazil"},
                {"Germany",     "Italy",    "UK"},
                {"Afghanistan", "India",    "Pakistan"  },
                {"Kenya",        "Nigeria",  "Ghana"}
        };
        for (int row = 0; row <countries.length ; row++) {
            for (int column = 0; column <countries[row].length ; column++) {
                System.out.print(countries[row][column]+ "  ");
            }
            System.out.println();
        }
        System.out.println("====================================");

       for(String [] row:countries){
           for(String column:row){
               System.out.print(column+ " ");
           }
           System.out.println();
       }


    }
}

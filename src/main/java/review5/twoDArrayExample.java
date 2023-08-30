package review5;

public class twoDArrayExample {
    public static void main(String[] args) {

        String[][] countries = { // 2D array is colletion of 1Darray
                {"Canada", "USA"},    // 0
                {"Ecuador", "Brazil", "Chile", "Argentina"},    // 1
                {"Romania", "France", "Italy"}     //2
        };
        System.out.println(countries.length);   // 3 number of ID arrays

        for (String[] countryArray : countries) {           //  array name = countries   // outer loop iterates over 1D arrays

       for (String country:countryArray) {  // array name =countryArray  // inner loops iterate over each element inside that 1D array
           System.out.println(country);
       }
        }
    }
}
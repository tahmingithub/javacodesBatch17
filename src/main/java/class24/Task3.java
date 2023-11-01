package class24;

import java.util.ArrayList;

public class Task3 {   // enhanced for loop we can only print  , there is no index on it
    /*                    that is why we use  for loop cuz we get drink one by one.
    Create an arrayList of drinks call it. If any drink has letter “a”
    or “e” replace the whole word with water.
     */
    public static void main(String[] args) {

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("coffee");
        drinks.add("tea");
        drinks.add("cola");
        drinks.add("sprite");
        drinks.add("Milk");

        for (int i = 0; i < drinks.size(); i++) {

            String drink=drinks.get(i);  //  we change to String to get the individual drink one by one
            if(drink.contains("a")||drink.contains("e")){   //  \\ means or
                drinks.set(i,"Water");
            }
        }

        System.out.println(drinks);
    }
}


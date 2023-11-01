package class25;

import java.util.LinkedHashSet;

public class T4Sets {
    public static void main(String[] args) {
/*
Create a Set of cities in which you want to make sure that insertion order is maintained.
Then remove any city that starts with “A”;
 */
        LinkedHashSet<String> cities= new LinkedHashSet<>();
        cities.add("Toronto");
        cities.add("New York");
        cities.add("Vancouver");
        cities.add("Amsterdam");
        cities.add("Calgary");
        cities.add("Maryland");
        cities.add("Berlin");
        cities.add("Aurora");
        cities.add("Ankara");
        cities.add("Alexandria");
        System.out.println(cities);


        cities.removeIf(x->x.toLowerCase().startsWith("a"));
        System.out.println(cities);

    }

}




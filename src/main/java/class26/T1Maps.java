package class26;

import java.util.LinkedHashMap;

public class T1Maps {
    public static void main(String[] args) {
        /*
        Create a map of a building. Store floor number and its associated company name. (Example: 1= Google, 2=Syntax etc..).
         Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map
         */  // we use linkedHasMap to maintain the order
        LinkedHashMap <Integer, String> building= new LinkedHashMap<>();
        building.put(1,"Google");
        building.put(2,"Syntax");
        building.put(3,"Google");
        building.put(4,"Amazon");
        building.put(5,"Carbon60");
        building.put(6,"SAP");
        building.put(7,"Syntax");

        System.out.println(building);
        System.out.println(building.size());   //7
        System.out.println(building.replace(4,"google"));
        System.out.println(building.remove(7));

        System.out.println(building);    // updating company



    }
}

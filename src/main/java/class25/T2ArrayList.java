package class25;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class T2ArrayList {
        /*  How can you remove all the duplicates from ArrayList?
        List<String >aList= new ArrayList<>();
        aList.add("John");
         aList.add("Jane");
         aList.add("James");
         aList.add("Jasmine");
         aList.add("Jane");
          aList.add("James");
         */

        public static void main(String[] args) {
            List<String> aList = new ArrayList<>();
            aList.add("John");
            aList.add("Jane");
            aList.add("James");
            aList.add("Jasmine");
            aList.add("Jane");
            aList.add("James");
            System.out.println(aList);
            LinkedHashSet<String> set = new LinkedHashSet<>(aList);// -->>use linkhashset
            aList.clear();   //clear-> means no data
           aList.addAll(set);
            System.out.println(aList);


        }
    }



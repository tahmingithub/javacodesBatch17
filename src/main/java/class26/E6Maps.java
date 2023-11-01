package class26;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class E6Maps {  // home come we nest one datastructore inside another dataStructure
    public static void main(String[] args) {
        ArrayList<Double> pricesOfMakeup= new ArrayList<>();
        pricesOfMakeup.add(25.5);
        pricesOfMakeup.add(30.2);
        pricesOfMakeup.add(25.2);

        ArrayList<Double> pricesOfFruit=new ArrayList<>();
        pricesOfFruit.add(2.5);
        pricesOfFruit.add(3.99);
        pricesOfFruit.add(4.99);

        ArrayList<Double> pricesOfDairy=new ArrayList<>();
        pricesOfDairy.add(1.99);
        pricesOfDairy.add(2.99);
        pricesOfDairy.add(3.99);
        pricesOfDairy.add(4.99);

// we do nested,one datastructure  inside another datastucture
// map=>class, String=>datatype
// , Arraylist=>classname
        // ArrayList, name of class from above class
        //Double =.name of datatype from above class
        //ArrayListMap=.variable name
        Map<String,ArrayList<Double>> arrayListMap=new LinkedHashMap<>();
        arrayListMap.put("pricesOfMakeup",pricesOfMakeup);
        arrayListMap.put("pricesOfFruit",pricesOfFruit);
        arrayListMap.put("pricesOfDairy",pricesOfDairy);
        System.out.println(arrayListMap);

    }
}

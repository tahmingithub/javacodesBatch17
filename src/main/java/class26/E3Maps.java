package class26;

import java.util.Collection;
import java.util.TreeMap;

public class E3Maps {
    public static void main(String[] args) {
// Tree Map sort based on  alphabetically order
        TreeMap<String, Double> makeUp= new TreeMap<>();
        makeUp.put("Lipstick",22.00);
        makeUp.put("BlushOn",40.0);
        makeUp.put("Base",50.00);
        makeUp.put("Foundation",90.00);
        makeUp.put("EyeLiner",25.5);
        makeUp.put("EyeLiner",25.5);
        makeUp.put("Concealer",35.5);
        System.out.println(makeUp);
        System.out.println("**********");
        Collection<String> onlyKeys= makeUp.keySet() ;      //storeed in form of collection       // collection is parent
        Collection<Double> onlyValue= makeUp.values();
        System.out.println(onlyKeys);
        System.out.println(onlyValue);

    }

}

package class26;

import java.util.TreeMap;

public class E10Maps {
    public static void main(String[] args) {
        TreeMap<String, Double> makeup = new TreeMap<>();
        makeup.put("Lipsticks", 22.0);
        makeup.put("BlushOn", 40.0);
        makeup.put("Base", 50.5);
        makeup.put("Foundation", 90.5);
        makeup.put("EyeLiner", 25.5);
        makeup.put("Concealer", 35.5);
        makeup.put("EyeLiner", 25.5);
     // makeup.entryset()=> is method
       /* Set<Map.Entry<String, Double>> entries = makeup.entrySet();
        for(Map.Entry<String, Double> e:entries){

            System.out.println(e.getKey()+" "+e.getValue());
        }*/
// var keyword, says you dont need datatype
        var entries=makeup.entrySet();      //var keyword ,
        for(var e:entries){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}



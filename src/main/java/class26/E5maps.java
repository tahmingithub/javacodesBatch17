package class26;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class E5maps {
    public static void main(String[] args) {

            TreeMap<String,Double> makeup=new TreeMap<>();
            makeup.put("Lipsticks",22.0);
            makeup.put("BlushOn",40.0);
            makeup.put("Base",50.5);
            makeup.put("Foundation",90.5);
            makeup.put("EyeLiner",25.5);
            makeup.put("Concealer",35.5);
            makeup.put("EyeLiner",25.5);
       // Maps are collection of entries
        // Entries are collection of key value pairs
       // set include => entries  include +>key,value.
        // entryset is a method, it return us all the entries in form of set.
        //below is called nested , we have set , inside set we have enteries and inside enteries , we have key value pairs.
       // it is like a makeup box inside another box.
            Set<Map.Entry<String,Double>> entries= makeup.entrySet();
            for (Map.Entry<String,Double> e:entries){
                System.out.println(e.getKey()+" "+e.getValue());
            }

        }
    }


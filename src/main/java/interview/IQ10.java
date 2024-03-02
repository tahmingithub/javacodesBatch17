package interview;

import java.util.ArrayList;

public class IQ10 {
    public static void main(String[] args) {

       /* You have a list of strings and you want to keep only those that start
        with “A” and you want to return them in lower case"*/


            ArrayList<String> words = new ArrayList<>();

            words.add("Ayesha");   // in map we use put when we add name
            words.add("Abi");
            words.add("Deepali");
            words.add("Guilia");
            words.add("Jamel");


        for (String v : words) {
            if(v.startsWith("a")||v.startsWith("A")){
                System.out.println(v.toLowerCase());
            }


            }
        }
    }

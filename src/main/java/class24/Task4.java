package class24;

import java.util.ArrayList;

public class Task4 {
    /*
    create an arrayList of Words. remove every word that ends with "e".

     */
    public static void main(String[] args) {

        ArrayList<String> words= new ArrayList<>();
        words.add("milk");   // arraylist is dynamic data stracture that  shift its indexes when perform operations on it.
        words.add("banana");   // when we remove coffee,  the index of table  before removing coffee was 3 now it is 2
        words.add("coffee");
        words.add("table");
        words.add("Tv");
        // System.out.println(words);
/*
for (int i = 0; i < words.size(); i++) {

            if(words.get(i).endsWith("e")){
                words.remove(i);
                i--;
            }
        }*/

    /*    words.removeIf((String x)->{
            if(x.endsWith("e")){
                return true;
            }else {
                return  false;
            }
        });*/

        words.removeIf(x->x.endsWith("e")); //  words is name of arraylist, .remove is method, if ()=> is our condition/.
                                             // for each element of arraylist  we create variable x.
        System.out.println(words);

    }
}


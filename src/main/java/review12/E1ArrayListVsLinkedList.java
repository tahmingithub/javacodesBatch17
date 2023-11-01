package review12;

import java.util.ArrayList;
import java.util.LinkedList;

public class E1ArrayListVsLinkedList {
    public static void main(String[] args) {

        ArrayList<String>names = new ArrayList<>();
        // names = variable , object
        //String ->data type of arrayList
        names.add("Jamel");
        names.add("Deepali");
        names.add("Ali");
        names.add("John");
        names.add("Adam");

        LinkedList<String> names2=new LinkedList<>();
        names2.add("Jamel");
        names2.add("Deepali");
        names2.add("Ali");
        names2.add("John");
        names2.add("Adam");

    }
}

package class23;

import java.util.ArrayList;

public class E2ArrayList {

        public static void main(String[] args) {

            ArrayList names=new ArrayList();// name is variable
            names.add("Sajana"); // add => means add element to the arraylist
            names.add("Avis");
            names.add(10);
            names.add('F');
            System.out.println(names.size());   //
            System.out.println(names);
            names.remove(0);//  remove the element from index
            System.out.println(names.size());  // size => number of element
            System.out.println(names);
        }
    }

// collection Framework: is  dynamic means they grow and shrink.
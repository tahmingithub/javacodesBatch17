package class24;

import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {

        ArrayList<String> names= new ArrayList<String>();  //  names=> variable name, ArrayList class, new create new ob
          names.add("Deepali") ; // NAMES=ARRAYLIST,ADD=>method             // ArrayList<>  constructor that 0 element
          names.add("ahmad");                             // overloading give more option for end user
        names.add("Mike");
        names.add("John");
        names.add("Ali");
       // names.remove(0);
        names.remove("Deepali");
        System.out.println(names);
        names.add(2,"Ehab"); // it is dynamic means in index 2 we add ehab
        System.out.println(names);
        names.set(1,"Jamel");
        System.out.println(names);

    }

}

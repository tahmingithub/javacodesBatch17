package class24;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {


        // String [] names={"add","sss"};
        ArrayList<String> names = new ArrayList<>();
        names.add("Deepali");
        names.add("Ahmed");
        names.add("Mike");
        names.add("John");
        names.add("Ali");
        for (int i = 0; i < names.size(); i++) {   // using for loop // For array we used names.length(),  Arraylist we use names.size();
            System.out.println(names.get(i));   /// for array we used names[], for arraylist  names.get(i)
        }
        System.out.println("************************");
        for (String v : names) {   // using enhanced for loop, v is variable,  names=> name of arraylist
            System.out.println(v);
        }
        System.out.println("************************");

        int i = 0;         // while loop
        while (i < names.size()) {
            System.out.println(names.get(i));
            i++;
        }
    }
}


package class23;

import java.util.ArrayList;

public class E4ArrayList {
    public static void main(String[] args) {

        ArrayList<String> arr=new ArrayList();// String=> datatype , array => variable // <> angle bracket, daimond operator
        arr.add("Ace");
        arr.add("Habib");
        arr.add("Gulcan");
        System.out.println(arr.get(2));  //get on specified index.
        System.out.println(arr.isEmpty()); //  it is false there is elements
        System.out.println(arr.contains("sdsd")); // returns true if element is present otherwise false
        System.out.println(arr.indexOf("Habib")); //   Returns the index of the element.

    }
}


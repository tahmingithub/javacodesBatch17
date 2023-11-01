package class24;

import java.util.ArrayList;

public class Task2 {
    /*   Create an arraylist of cars and retrieve all the values using 2 different ways.
     */
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Tesla");
        cars.add("Mercedes");

        System.out.println(cars);


        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));  // get index
        }

        for (String n : cars) {
            System.out.println(n);
        }
    }
}

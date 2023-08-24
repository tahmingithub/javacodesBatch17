package class7;

public class E10Array {
    public static void main(String[] args) {
// 1: first way to create Array. In here we are Creating  the Array and also initializing arrays
        String [] fruit={"Apple","Orange","Banana","Kiwi", "Mango","PineApple"};
        System.out.println(fruit[2]);

        fruit[3]="Mango";

        for (int i = 0; i < fruit.length; i++) {
            System.out.println(fruit[i]);
        }

    }
}

package class7;

public class E9Array {
    public static void main(String[] args) {

        String [] fruit={"Apple","Orange","Banana","Kiwi", "Mango","PineApple"};
        System.out.println(fruit[2]);
        System.out.println(fruit.length); // gives us  number of items in the array, number of fruits on here is 5
        for (int i = 0; i < fruit.length; i++) {
            System.out.println(fruit[i]);
        }

    }
}

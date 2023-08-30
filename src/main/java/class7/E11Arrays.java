package class7;

public class E11Arrays {
    public static void main(String[] args) {
        // 2: Second way to create Array. in here we  are only creating Array . creating Arrays
        int [] prices=new int[5];   //     5 is size of Array,
        prices[0]=1000;
        prices[2]=250;
        prices[2]=234;
        System.out.println(prices[4]);      // if we put 5 , it gives us error cuz it is outsides of  range 5.
        System.out.println(prices[2]);
        System.out.println(prices[2]);     // it prints 234 because  it takes the last one



    }
}

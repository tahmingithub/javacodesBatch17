package class7;

public class T7Arrays {
    public static void main(String[] args) {
            /*
       print even number on this array.

        */
        int [] numbers={20,29,48,69,60};   // 20, 48,60

        for (int i = 0; i < numbers.length ; i++) {
            if(numbers[i]%2==0){                        // if any number %2 =0 , it is an even number
                System.out.println(numbers[i]);}            // if we say   if(numbers[i]%2!==0, gives odd numbers

        }
    }
}

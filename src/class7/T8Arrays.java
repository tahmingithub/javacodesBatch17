package class7;

public class T8Arrays {
    public static void main(String[] args) {
          /*
        add all the numbers from the  array and print the sum at the end
         */

        int[] numbers = {20, 10, 50, 30, 40,};  //150

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];  //  pick the Previous value of sum and add it to current value of array
            System.out.println(sum);
        }

        System.out.println("======");
    }

}

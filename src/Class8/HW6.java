package Class8;

public class HW6 {
    public static void main(String[] args) {
//Create an array on integers and calculate the sum of all elements in an array
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];

        }
        System.out.println(sum);
    }
}
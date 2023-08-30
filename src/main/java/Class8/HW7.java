package Class8;

public class HW7 {
    public static void main(String[] args) {

        //From an array of integer elements find the largest number.
        int[] numbers = {1, 2, 3, 4, 5, 6, 0};
        int largest=numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > numbers[0]) {
            largest=numbers[i];
            }

        }
        System.out.println("Largest number is "+ largest);
    }
}
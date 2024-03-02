package interview;

public class IG2 {
    public static void main(String[] args) {

        //Write a java program to find the second largest number in the array?

        int[] numbers = {10, 12, 16, 17, 22, 26, 32, 33, 65};
        int size = numbers.length;
        int n;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (numbers[i] > numbers[j]) {
                    n = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = n;
                    System.out.println("The second largest number is " + numbers[size - 2]);
                }
            }
        }
    }
}

package Class8;

public class T3arrays {
    public static void main(String[] args) {
        // count how many numbers are greater than 10 in below array
        //  expected answer: 3


        int[] numbers = {10, 20, 4, 3, 8, 45, 96};
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 10) {
                count++;
            }
        }
        System.out.println(count);

        System.out.println("===========");


    }
}
package interview;

public class interview6 {
    public static void main(String[] args) {

        int sum = 0;
        int[][]num = {
                {10, 20, 30, 40, 50},
                {10, 20, 30, 40, 50},
                {10, 20, 30, 40, 50},
                {10, 20, 30, 40, 50},
        };
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j]);
                sum = sum + num[i][j];

            }
        }
        System.out.print(sum);
    }
}
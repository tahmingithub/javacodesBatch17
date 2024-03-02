package interview;

public class interview8 {
    public static void main(String[] args) {


        int[][] nums = {
                {10, 20, 30, 45, 15, 35},
                {10, 20, 30, 45, 15, 35},
                {10, 20, 30, 45, 15, 35},
                {10, 20, 30, 45, 15, 35},};
        for (int i = 0; i <nums.length ; i++) {
            for (int j = 0; j <nums[i].length ; j++) {
            if(nums[i][j]%2==0){
                    System.out.print(nums[i][j]);
                }
            }
        }


    }
}
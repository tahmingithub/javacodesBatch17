package class9;

public class HW3 {
    public static void main(String[] args) {
        /*Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
         Develop a program which will identify/print the even numbers only.
         */
       int [][]nums={
               {4,  1,   8,   77 },
               {10, 44,  66,  55 },
               {100,  35,  200,   34},
       };
        for (int i = 0; i <nums.length ; i++) {
            for (int j = 0; j <nums[i].length ; j++) {
                if(nums[i][j]%2==0){
                    System.out.print(nums[i][j]+ " ");
                }
            }
        }
    }
}

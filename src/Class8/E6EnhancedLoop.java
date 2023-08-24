package Class8;

public class E6EnhancedLoop {
    public static void main(String[] args) {

        int[] nums = {10, 77, 25, 56, 60, 20};    //  //replace nay number that is greater than 20 to 0
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > 20) {   // if any num greater than 20, then
                nums[i] = 0;     //that num=0
            }

            System.out.println(nums[i]);
        }

    }

}



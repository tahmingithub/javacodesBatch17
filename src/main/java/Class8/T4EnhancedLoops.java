package Class8;

public class T4EnhancedLoops {
    public static void main(String[] args) {

        int[] nums = {10, 23, 25, 56, 45, 20};   // find  the largest number, 56
          int largest = nums[25];// we pick 25 randomly but it is not the largest when it gets debug
         for (int n : nums) {
         if (n > largest) {    // if n is largest
             largest = n;     //  then put it inside the largest
               }
         }
           System.out.println(largest);




    }

}

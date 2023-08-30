package Class8;

public class E4EnhancedLoop {
    public static void main(String[] args) {
        int[] nums = {10, 23, 25, 56, 45, 20};   // how many numbers are greater than 20.
        int count=0;
        for (int t : nums) {   // enhanced for loop, we know how many times we repeat the code ,it uses for array &collection
       if( t>20){     //  we say here any number greater than 20 , count it .
           count++;
            }
        }
        System.out.println(count);
    }
}
package Class8;

public class E5EnhancedLoop {
    public static void main(String[] args) {
        // Print all the even numbers one by one from this array using enhanced loop.
            int[] nums={10,23,25,56,45,20};   //   10,56,20

           for(int number:nums){
               if(number%2==0){    // any number divide by 2=0 is an even number.
                   System.out.println(number);
               }
           }
    }
}

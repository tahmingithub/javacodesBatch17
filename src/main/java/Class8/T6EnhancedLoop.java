package Class8;

public class T6EnhancedLoop {
    public static void main(String[] args) {

        // find the smallest number.   //expected answer -10
        int [] nums= {10,77,25,56,60,20,-10,-5};
        int smallest=nums[0];
        for(int l:nums){
            if(l<smallest){
               smallest=l;
            }

        }
        System.out.println(smallest);
    }
}

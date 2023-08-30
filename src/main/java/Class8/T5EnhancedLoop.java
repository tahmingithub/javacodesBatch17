package Class8;

public class T5EnhancedLoop {
    public static void main(String[] args) {
        //find The largest even number
        int [] nums={10,77,25,56,60,20};    //  even largest is 60
        int largest=nums[0]; //     num[o] is 10
        for(int d:nums) {

               if(d>largest&&d%2==0)   {
                    largest=d;
               }

               }
        System.out.println(largest);

    }
}

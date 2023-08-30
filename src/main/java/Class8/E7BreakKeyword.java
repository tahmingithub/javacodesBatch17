package Class8;

public class E7BreakKeyword {
    public static void main(String[] args) {
        //You have to Search the array for number 45 if it is present in the array . print found


        int[] nums= {10,23,25,56,45,20};
      for(int n:nums){
          if(n==10){
              System.out.println("found");
              break;
          }
      }

    }
}



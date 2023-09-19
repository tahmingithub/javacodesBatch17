package class12;

public class T1Method {
    // Create a method will take parameters as a numbers  and
    // prints which number is larger.
     void PrintLarger(int num1, int num2){
         if(num1>num2){
             System.out.println("Larger number is "+ num1);
         }else{
             System.out.println("Larger number is "+ num2);
         }
     }
     /* Create a method that will take a number and prints whether it is odd or even
      */

     void checkEvenOdd(int num){
         if(num%2==0){
             System.out.println(num+ "  is even number");
         }else{
             System.out.println(num+ " is odd number");
         }
     }

}

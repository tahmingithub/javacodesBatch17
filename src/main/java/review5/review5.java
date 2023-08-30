package review5;

public class review5 {
    public static void main(String[] args) {

        int[] array = {10, 11, 12, 13, 55, 34, 24};//   //Array is datastructure, array holds multiple values

        int a = 10;
        int numberOfElements = array.length;
        System.out.println(numberOfElements);
        System.out.println(array[3]);
        //loop iterate mean repeats
        /* when to use loops- when we want to repeat a block of code


       1: when we do not know the exact number of iterations- while or do while

       2: when we know how many times we want to repeat or iterate the code- for loop or enhanced for loop
         we use enhanced for loop only with arrays or collections

         */
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
   /*
          Enhanced for loop syntax
          for (datatypeoflelemnt any variableName: NameOfTheDataStructure)
    */

        // int [] array= {10,11,12,13, 55,34,24};
        for (int ar : array) {
            System.out.println(ar);
        }
    }
}


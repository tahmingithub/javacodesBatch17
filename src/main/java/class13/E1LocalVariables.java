package class13;

public class E1LocalVariables {
    public static void main(String[] args) {
      String country ="USA";   //  this variables create inside the class, this is instance variables
      String name ="java";
        if (10 > 5) {
            int age=23;          // local variable,  age variable created inside if , we can only  access within the block, we cant access outside the block
            System.out.println(name );   // we can access name because it is inside main block
            System.out.println(age);
        }
        //System.out.println(age);    //   wrong
        System.out.println(name);



    }
    int salary=2000;
}
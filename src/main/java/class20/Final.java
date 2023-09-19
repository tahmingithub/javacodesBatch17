package class20;

public class Final {
    public static void main(String[] args) {

    final int AGE=12;  // if we put final , means no one is able to change the value
    //AGE=20;
    System.out.println(AGE);

}
}
final class Parent{

    final String color="Red";
    final void marry(){   // method
        System.out.println("take our permission first");
    }

}

/*class Child extends Parent{
 *//*  @Override
    void marry(){
        System.out.println("I want to marry someone else");
    }*//*
}*/



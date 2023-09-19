package class22;
                            // interface design for abstract //
public interface MoveAble { // for interface we dont click on java class instead we  click on interface.

      void move (); // abstract method cuz  the method is without body method.
    void method1();
}

interface WashAble{          //
    void wash();
    void method1();
}
 class Dog implements MoveAble,WashAble{         // class inherit from Movalble , and we use implements
     public  void move (){
         System.out.println("Dogs can jump run and can move");
     }

     @Override
     public void wash() {

     }

     public void method1(){
         System.out.println("You can safely wash a Dog");
     }
}
class Car implements MoveAble, WashAble{
    @Override
    public void move() {
        System.out.println("Car can move forward backwards and far in circles");
    }

    @Override
    public void method1() {

    }
    public void wash(){
        System.out.println("We can wash a car");
    }
}
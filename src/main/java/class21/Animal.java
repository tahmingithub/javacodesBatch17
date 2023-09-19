package class21;
                       // abstract means it is under  construction. cuz it does not have body of method.
public  abstract class Animal{ //we add abstract word in here to say that our class is not complete.cuz it doesnt have body of method (sout)(implementation)
   abstract  void speak();  // we add abstract means it is incomplete method cuz it doesnt have body of method
    abstract void sleep(); // obstruction help us hide the implementation details and show functionality(METHOD)
    abstract void eat();   // LIKE COFFEE machine, we only click to get our coffee
}
 class Dog extends Animal{    // class Dog  parent class

    void speak(){
        System.out.println("Wuff wuff");
    }
    void sleep(){
        System.out.println("Sleeping for last 10 hours");
    }
    void eat(){
        System.out.println("Eating bones....");
    }
 }
 class  Cat extends Animal{    // class Cat
    void speak(){
        System.out.println("Meow Meow.....");
    }
    void sleep(){
        System.out.println("Cats sleeo for 12-16 hours");
    }
    void eat(){
        System.out.println("LIke to eat Fish");
    }
 }
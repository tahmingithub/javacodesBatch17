package class17;

public class AnimalTester {
    public static void main(String[] args) {

        Cat c=new Cat(); //create object cat//java create constructor for us , default is constructor, and it is hidden
        c.name="Tom";   //Cat is class, c object,
        c.breed="Russian"; //object.variable name
        c.color="white";
        c.age=8;
        c.attitude=true;
        c.printInfo(); // object.method
        Dog d= new Dog();  // we create object of child class
        d.bark();
        d.name ="Jacky";
        d.breed="German";
        d.printInfo();
        Animal a= new Animal(); // parent class
        a.name="Jim";
        a.color="black";
        a.printInfo();
    }
}

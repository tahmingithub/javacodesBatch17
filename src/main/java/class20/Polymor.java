package class20;

public class Polymor {
    public static void main(String[] args) {
       /* Animal a=new Animal();  // long way we had to create object for each class
        a.speak();
        a.sleep();
        a.eat();

        Dog d=new Dog();
        d.speak();
        d.sleep();
        d.eat();
        Cat c=new Cat();
        c.speak();
        c.eat();
        c.sleep();*/
//  using enhanced loop
        Animal[] arr = {new Cat(), new Dog(), new Animal()}; // we write name of classes which are cat, dog, animal and we
        for (Animal a : arr) {       // add new cuz we create object of classes, so we can write smaller code using enhanced for loop
            a.eat();  //a=> variable name    eat()=> method
            a.sleep();
            a.speak();

        }
// using for loop
     /*   for (int i = 0; i < arr.length; i++) {   // using for loop
            arr[i].eat();  // arr[i]=>name of array . eat=>name of method
            arr[i].sleep();
            arr[i].speak();

        }*/

    }
}
     /*   ***My note Array Syntax***
    Datatype[] nameOfTHe Array={element1,element 2,element3}
        Method2:
        Datatype[] nameOfTHe Array=new DataType[size or number of elements that we store] */
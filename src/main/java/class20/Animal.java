package class20;

public class Animal {// method override// same method in parents and child class but we can change the sout part in child class if we dont like.
    void speak(){ // void is called return method , speak is name of method ,
        System.out.println("Animal can speak");
    }
    void sleep(){
        System.out.println("Animals sleep");
    }
    void eat(){
        System.out.println("Animals eat");
    }
}
class Dog extends Animal{ // extends means bring everything from Animal(parent) class .
    @Override
    void speak(){ // it does not have eat method but it gets eat from parent class.
            System.out.println("wuff wuff");
        }
    }
class Cat extends Animal{
    @Override
    void speak() {
        System.out.println("Meow moew");
    }
}

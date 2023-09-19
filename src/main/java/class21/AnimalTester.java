package class21;

public class AnimalTester {
    public static void main(String[] args) {
        Animal [] arr={new Dog(), new Cat(),};//  datatype=> Animal
        for(Animal a:arr){ //  used enhanced loop
            a.speak();
            a.sleep();
            a.eat();
        }
// abstract means incomplete class, means under construction.

    }
}


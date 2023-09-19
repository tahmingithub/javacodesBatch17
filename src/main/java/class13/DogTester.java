package class13;

public class DogTester {
    public static void main(String[] args) {

        Dog d1= new Dog(); // creating object here
        d1.name="pico";
        d1.breed="persian";    //declare the value
        d1.age=36;



        Dog d2=new Dog();
        d2.name="Papi"; // d2 = object , name = variable
        d2.breed="German";
        d2.age=21;
        d1.printInfo();  // d1 =object, printInfo=method name
        d2.printInfo();

    }
}

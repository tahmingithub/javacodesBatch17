package class10;

public class DogTester {
    public static void main(String[] args) {
        //creating an obj from the DOg class
        Dog lunasObj=new Dog();// we create object name lunaObject
        // assigning a value to name using lunasObj
        lunasObj.name="Luna";
        lunasObj.gender='F';
        lunasObj.breed="Shiba";
        lunasObj.weight=10;
        lunasObj.age=20;
        System.out.println(lunasObj.name);
        System.out.println(lunasObj.age);
        System.out.println(lunasObj.breed);

// we are calling the bark method on lunasObj
        lunasObj.bark();
        lunasObj.eat();
        lunasObj.sleep();
    }
}

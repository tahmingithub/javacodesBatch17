package class15;

public class Dog {
    private String name;   // it should be private because  no other class will be able to access this class
    private String breed;
    private String color;
    private int age;

    //constructor
    public Dog(String dName, String dBreed, String dColor, int dAge) {//   constructor no need for void, constructor name of class
        name = dName;
        breed = dBreed;
        color = dColor;
        age = dAge;
    }

    public void bark() {
        System.out.println("woof woof...");
    }

    public void printInfo() {
        System.out.println(name + " " + breed + " " + color);

    }
}



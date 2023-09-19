package class18;

public class Car {
    private String make;  // instance variable or instance field
    private String model;
    private double price;
    private String color;
// we  have two constructor
    public Car(String make, String model, double price, String color) {// constructor ,parameter
        this.make = make;// this means we call the instance variable
        this.model = model;// we create constructor , constructor to use instance variable
        this.price = price;
        this.color = color;
    }
    public Car(String make, String model, double price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }
    void printInfo() {  // method
        System.out.println(make + " " + model + " " + price + " " + color);

    }
}
class BMW extends Car {

    public BMW(String make, String model, double price, String color) {
        // Calling the constructor from the parent class
        super(make, model, price); // we call constructor from parent class
    }                             // child class at least should match one of the parent constructor
}

class Audi extends Car {
    boolean sunRoof;


    public Audi(String make, String model, double price, String color) {
        super(make, model, price, color);
    }
}



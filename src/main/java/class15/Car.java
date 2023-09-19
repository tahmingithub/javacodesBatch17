package class15;

public class Car {
    private String make;
    private String model;   // field
    private String color;
    private double price;

    public Car(String cMake, String cModel, String cColor, double cPrice) {  // Car is constructor same as class name. inside the paranthese is parameter
        make = cMake;
        model = cModel;
        color = cColor;   //we initialize it
        price = cPrice;
    }

    public void printInfo(){
        System.out.println(make+" "+model+" "+color+" "+price);
    }
    void setPrice(double cPrice){
        price=cPrice;
    }
    double getPrice(){
        return price;   //          when we have void we don't use return , there we have double and we use return
    }

}





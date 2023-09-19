package class19;

public class Animal {
   private String name;
    private String color;
   private int age;
   int num=10;
    public Animal(String name, String color, int age) {  //  right click on generate then click on constructor then select all to
        this.name = name;
        this.color = color;
        this.age = age;
        int num=10;
    }

    public void printInfo(){
        System.out.println(name+" "+color+" "+age);
    }
}

class Dog extends Animal {
    int num = 20;
    double weight;
    public Dog(String name, String color, int age, double weight) {

        super(name, color, age);
        this.weight = weight;
    }

    public void printInfo() {  // it prints this method becuase it is class to child class
   // we overwrite, rewrite

    //  we can use parents method and int num=10 too
    //  but we can create our own , we override ( rewrite) in child class too
// we create same method in parents and child class means override.
       super.printInfo();   // we say print parent print info,
        System.out.println(weight);// we say print the weight from child class too

}
}

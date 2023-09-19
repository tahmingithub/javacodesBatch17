package class16;

public class Person {
    private String name;
    private int age;
    private double weight;
    private char gender;
    private int salary;
    private String hairColor;

    public Person() {  // constructor without parameter , constructor 1

    }

    public Person(String name, int age, double weight) {  // constructor 2
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Person(String name, int age, double weight, char gender) { //constructor 3
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
    }

    public Person(String name, int age, double weight, char gender, int salary, String hairColor) { //constructor 5
        this(name, age, weight, gender);
        this.salary = salary;
        this.hairColor = hairColor;
    }

    public void printInfo() {
        String name = "Giu";
        System.out.println(this.name + " " + age + " " + weight + " " + gender+" "+salary+" "+hairColor);
    }
}

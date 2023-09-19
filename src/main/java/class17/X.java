package class17;

public class X {  // Task 1
    /* Write program for multilevel inheritance where class Z inherits from class Y
    and Class Y inherits from Class X.
     */
    String name;
    void printName(){
        System.out.println(name);
    }
}
class Y extends X{
    String lastName;
    void printLastName(){
        System.out.println(lastName);
    }
}
class Z extends Y {
    int age;

    void PrintAge() {
        System.out.println(age);
    }
}
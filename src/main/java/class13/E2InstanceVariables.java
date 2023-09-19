package class13;

public class E2InstanceVariables {
    String name="Hind";
    void printAge(){
        int age=25;  // it is instance variable becz variable created inside class.
        System.out.println(age);
        System.out.println(name);
        System.out.println(country);
    }
    void printCountry(){
        // System.out.println(age); error its a local variable can't be accessed here
        System.out.println(name);
        System.out.println(country);
        if(10>5){
            System.out.println(country);
        }
    }
    static String country="Uganda";
}
package class17;
// this is called Hierarchical because it is one parent and multiple child, dog and cat is the child
public class Animal {  // parent class   /// child  inherit staff  from parents
    String name;    // field
    String breed;
    String color;
    int age;
    void printInfo(){
        System.out.println(name+" "+ breed+ " "+color+" " +age);
    }// method
}

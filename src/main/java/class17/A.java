package class17;

public class A {   // multilevel inheritance// grandMa
    String name;
    void printName(){
        System.out.println(name);
    }
}
 class B extends A {   ///Mother
    String color;
    void printColor(){
        System.out.println(color);
    }
 }
class C extends B {   // child// it is multilevel inheritance cuz class c child get from class B mom and from class A grandma.
    void printNameColor(){
        System.out.println(name+ " "+ color);
    }
}
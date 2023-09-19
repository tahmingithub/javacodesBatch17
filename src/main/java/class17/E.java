package class17;

public class E {   // parent class
    /*
    Write program to inherit class E that has method printF which is static and call or reuse that method into class F.
     */

    static String name="jamel";   // since it is static modifier  we can access it , if it is private , we can't access it.
    static void printF(){     // Static we can access inside class and any class within same package.
        System.out.println("ffff");
    }
}
class F extends E {   //child class
    public static void main(String[] args) { //  im able to use static field and static method from class E which is my parent class
        printF();              // I can inherite the field and method from class F (parent class) to class E
        System.out.println(name);

    }
}
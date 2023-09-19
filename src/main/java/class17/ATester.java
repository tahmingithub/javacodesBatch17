package class17;

public class ATester {    // tester of Class A
    public static void main(String[] args) {
        A a=new A();
        a.name= "Tom";
        a.printName();

        B b= new B();
        b.color="Black";
        b.printColor();

       C c=new C();
      c.printNameColor();
    }
}

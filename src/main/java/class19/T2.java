package class19;

public class T2 {
    /*
    Create 1 class with a static method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */
    public static void print() {   // method 1
        System.out.println("java is great");
    }

    public static void print(String word) {  // method 2
        System.out.println("java is " + word);
    }

    public static void main(String[] args) {
        T2.print();   // we can do print () do , t2 means if we are in another class then we use T2, here we are in same class so print()
        print();
        T2.print("good");


       // T2 t=new T2();
       // t.print("amaze");

    }
}
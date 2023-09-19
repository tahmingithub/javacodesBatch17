package class16;

public class ConTester {
    private ConTester(){       // constructor without parameter
        System.out.println("Private");
    }

    ConTester(String name){
        System.out.println("Default");
    }

    protected ConTester(int age){
        System.out.println("protected");
    }

    public ConTester(double weight){
        System.out.println("public");
    }

    public static void main(String[] args) {

        new ConTester();
        new ConTester("dnfdkj");
        new ConTester(1512);
        new ConTester(10.52155);

    }
}

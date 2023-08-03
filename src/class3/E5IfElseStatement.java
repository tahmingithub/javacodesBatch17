package class3;

public class E5IfElseStatement {
    public static void main(String[] args) {

        double accountBalance=800;
        double price=1000;

        if (accountBalance>=price) {     // 800>=1000, it is false, then it print the else part
            System.out.println("you can by this item");
        } else {
            System.out.println("you need to save more");
        }
    }
}

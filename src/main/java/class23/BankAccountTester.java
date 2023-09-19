package class23;



public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount b=new BankAccount("Marta",1252202152,16000000,
                "User123","Pass123","Checking");
        System.out.println(b.getName()); // b=.variable, object , getName => is method
        System.out.println(b.getBankAccountNumber());
       b.setName("Shawn");// we call setter method here , we change marta name to shawn , set means we can change it.
        System.out.println(b.getName()); //b=>variable ,  getName=> method
    }
}
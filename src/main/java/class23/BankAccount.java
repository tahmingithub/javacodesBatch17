package class23;
/* Encapsulation: we create class, inside  class create filed and make the field private, create constructor, create method
using getter , setter if you want others to  change and read the field .
*/  // class public, field private, constructor public , method public
public class BankAccount {
    private String name;  // filed
    final private long bankAccountNumber;
    private double balance;
    final private String userName;
    private String password;
    final private String accountType;
// just click on empty space then click generate, constructor automatically appear
    public BankAccount(String name, long bankAccountNumber, double balance, String userName,
                       String password, String accountType) {// over loading constructor we have 6 parameter
        this.name = name;
        this.bankAccountNumber = bankAccountNumber;
        this.balance = balance;
        this.userName = userName;
        this.password = password;
        this.accountType = accountType;
    }

    public BankAccount(long bankAccountNumber, String userName,// overloading constructor ,we have 4 parameter
                       String password,String accountType) {
        this.bankAccountNumber = bankAccountNumber;
        this.userName = userName;
        this.password = password;
        this.accountType=accountType;

    }
//
    public BankAccount( String userName
            , String accountType,long bankAccountNumber) {// we do overloading constructor,
        this.bankAccountNumber = bankAccountNumber;   //have different sequence(position) of datatype
        this.userName = userName;
        this.accountType = accountType;
    }
// we created here method
    public String getName(){  // we add get before Name method ,get means other person can only read it.
        return name;
    }

    public long getBankAccountNumber(){  //we add get before backAccountNumber method, to read it
        return bankAccountNumber;        //if no void in emthod it has  return type.
    }

    void setName(String name){ // method is Name we add set before name to change the name . it takes parameter too
        this.name=name;   // void doesnt have return type
    }

    String getAccountType(){
        return accountType;
    }


}
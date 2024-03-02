package interview;

public class interview1 {
    public static void main(String[] args) {


        // polindrome=> means the same backward
       // is it polindrom or no ?
        String Name = "Madam";
        for (int j = Name.length() - 1; j >= 0; j--) {
            if (Name.equals(Name)) {
                System.out.println("This is not polindrome");
            } else {
                System.out.println("This is polindrome");
            }
        }

        String n= "noon";
        for (int i = n.length()-1; i >=0 ; i--) {
            if(n.equals(n)){
                System.out.println("polindrom");
        }else{
                System.out.println("non polindrom");
            }
        }
    }
}


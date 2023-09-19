package class13;

public class SyntaxEmployee {
    /*
 Create a Class called SyntaxEmployee:
 Create three  variables  empID , salary and set the CEO to “Sumair”
 Create two objects of the class SyntaxEmployee
 Set the value of eID, salary for each of the objects
 Print out the eID , salary and  CEO for each of the objects
  */
    String empId;
    int salary;
    static String CEO = "Sumair"; // this is static variables

    public static void main(String[] args) {  // we created the tester in here instead of creating another class.
        SyntaxEmployee asghar = new SyntaxEmployee();
        asghar.empId = "I123";
        asghar.salary = -20;

        SyntaxEmployee moazzam = new SyntaxEmployee();
        moazzam.empId = "I456";
        moazzam.salary = 95;

        System.out.println(moazzam.empId); // mozzam = object,   empId = variable
        System.out.println(moazzam.salary);
        // mozzam is object,  variable salary is variable
        System.out.println(SyntaxEmployee.CEO);  //  to ceo we try first class whcih is syntaxEmplyee , still gives sumir
        System.out.println(moazzam.CEO);  //  to ceo we do object which mozzam, still gives sumir
        System.out.println(asghar.CEO); // because static string ceo is static , we can access anywhere and if we add o
        // object or class still comes out.


    }                                         // Static variable can be access anywhere , you dont need object
}



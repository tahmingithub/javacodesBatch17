package class16;

public class P1 {
    private static String name;
    private static String age;      // field
    private static double weight;   // instance variable is private
    private static char gender;

    public P1(String pName, String pAge, double pWeight, char pGender) {       // p1 constructor,
        name = pName;       // local  variable becz it is inside constructor
        age=pAge;
        weight = pWeight;     // // whenever we have same name on instance variable and local variable , java get the name from the local one
        gender = pGender;  // we initialize it
    }
    public static void printInfo() {//   void method is public
        System.out.println(name + " " + age + " " + weight + " " + gender);  //
    }

}



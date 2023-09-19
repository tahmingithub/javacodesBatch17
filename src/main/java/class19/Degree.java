package class19;
   /*
   Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.
Call the method by creating an object of each of the three classes
                        note: for override we should have exact same method
    */
public class Degree {  // class
    public void getPrerequisite() {  // method 1
        System.out.println("to get a degree you need high school diploma");
    }
}
    class Bachelors extends Degree { // class

    }
    class Masters extends Degree {  // class
        //  => annotation help compiler figure out the errors
        public void getPrerequisite() { // method 3

            System.out.println("you will get master if have have bachelor");
        }
    }
class tester{
    public static void main(String[] args) {
        Degree degree=new Degree();
        degree.getPrerequisite();

        Bachelors b1=new Bachelors();
        b1.getPrerequisite();

        Masters M=new Masters();
        M.getPrerequisite();
    }
    }

package class10;

public class Student {    // main method needed when we  execute, no main method need when we design
    // Properties/ Attributes
    String name;
    int age;
    String id;
    // Method/function/behaviors
    void study (){                     // void = behavior , study= name of behavior
        System.out.println("Studying 16 hr a day ....");
    }

    public static void main(String[] args) {
      Student ehabObj =new Student();  //=syntax, name of class student,  name of object ehabObj , name of class student,
                                         // we create actual student
                                        // by using the student class
        ehabObj.name="Ehab";
        ehabObj.age=23;
        ehabObj.id="abc123";
        ehabObj.study();   // scanner.nextINt()


        Student habibObj=new Student();
        habibObj.name="Habin";
        habibObj.age=20;
        habibObj.id="abc123";
        habibObj.study();
    }



}

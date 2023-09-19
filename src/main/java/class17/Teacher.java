package class17;

public class Teacher {
    /* Write a java program called Teacher. Identify features and 4 behavior of that Class. Create 3 subclasses
MathTeacher,Chemistry Teacher, and PianoTeacher. Test all 4 classes.
 */
String name;
String lstName;
void teach(){     // behavior , method
    System.out.println("teaching java");
}
void read(){
    System.out.println("very loud");
}
void write(){
    System.out.println("write very fast");
}
    void grade(){
        System.out.println("grading the test");
    }
}

class MathTeacher extends Teacher{ // extend means bring everything from parent class(Teacher).
    int schoolHour;
    void printHours(){
        System.out.println("schoolHour");
    }
}
class ChemistryTeacher extends MathTeacher{
    int numOfClasses;
    void printClasses(){
        System.out.println("numOfClasses");
    }
}
class PianoTeacher extends ChemistryTeacher {
    int numOfStudents;

    void printStudents() {
        System.out.println("numOfStudents");
    }
}
class TeacherTester{ // we want to test our Teacher class

    public static void main(String[] args) {
        MathTeacher m=new MathTeacher();
        m.read();

        ChemistryTeacher c= new ChemistryTeacher();
        c.write();
        c.printHours();

        PianoTeacher p=new PianoTeacher();
        p.teach();

      Teacher t=new Teacher();
      t.grade();

    }
    }

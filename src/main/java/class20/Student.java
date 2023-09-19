package class20;

public class Student {

    private String name;
  private  String id;
    public Student(String name, String id){   // Student =>constructor , String name , sting id =. parameter
        this .name=name;   // body of constructor
        this.id=id;


    }
    public void printInfo(){
        System.out.println(name+" "+id);
    }
}

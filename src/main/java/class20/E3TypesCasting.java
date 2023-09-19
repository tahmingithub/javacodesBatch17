package class20;

public class E3TypesCasting {
    public static void main(String[] args) {
        // new  create the object of a class,
        //Aslan and id => call to constructor, s1 is variable and object
        // Student is datatype
        //new =>create object
        //= assign
        //Student =>datatype

        Student s1 = new Student("Aslan", "A123");// student datatype
        Student s2 = new Student("Mikhail", "878787");

        Student[] arr = {new Student("Aslan", "A123"), new Student("Mikhail", "878787")};

        arr[1].printInfo();   // It Print Mikhail 12345
        System.out.println("======================");
        for (int i = 0; i < arr.length; i++) {   // loop
            Student s = arr[i];  // storing array value 1 by 1 and store it in s variable
            s.printInfo();
        }
        int num = (int) 12.5; // in there we convert double to int. 12.5 is double . we should put int next to 12.5.
        System.out.println(num);     // it print 12 , we changed the double to int
        double age = 10;

        Animal a = new Dog();
        Dog d = (Dog)  new Animal();


    }
}

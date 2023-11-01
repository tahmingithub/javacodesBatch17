package class26;

import java.util.LinkedHashMap;

public class E2Maps {
    public static void main(String[] args) {
// when you see link , it should print in order
        // we use key
        LinkedHashMap<Integer,String> students= new LinkedHashMap<>();
        students.put(10,"Adam");
        students.put(20,"Ehab");
        students.put(300,"Marta");
        students.put(44,"Ahmad");
        System.out.println(students);
        students.remove(300);   // name of method and the key ,  remove=> method, 300 =>key . we dont use index
        System.out.println(students);
        students.replace(20,"jamel");  // replace ehab and put jamel
        System.out.println(students);

    }
}

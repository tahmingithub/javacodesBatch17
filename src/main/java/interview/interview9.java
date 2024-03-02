package interview;

public class interview9 {
    public static void main(String[] args) {
// String buffer and stingBuilder are mutable means we can add and modify once we create  them .
        String a = "hello";
        String b = "hello";
        StringBuilder name= new StringBuilder();
        a=a.concat("Bye");
        System.out.println(a);

        String n= "Tahmin";
        for (int i = n.length()-1; i >=0 ; i--) {
            System.out.println(n.charAt(i));
        }


    }
}
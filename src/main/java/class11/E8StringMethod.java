package class11;

public class E8StringMethod {
    public static void main(String[] args) {

        String str = "Hi There how are you.I am Good. I am Driving";
        String[] strs = str.split("[.]");
        System.out.println(strs.length);
        System.out.println(strs[2]);
        System.out.println(strs[2].trim());




    }
}

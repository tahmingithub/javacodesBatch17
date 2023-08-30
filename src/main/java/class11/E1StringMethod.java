package class11;

public class E1StringMethod {
    public static void main(String[] args) {

        String str="Batch 17 is great.";
        System.out.println(str.charAt(0));// from this string I want character 0
        System.out.println(str.charAt(4));
        int length=str.length(); // 18
        System.out.println(length);
        System.out.println("***************");
        System.out.println(str.charAt(str.length()-1));//  str.length() =18-1 =17, str.charAt=.
        int lastIndex=str.length()-1;
        System.out.println(lastIndex);
        char c=str.charAt(lastIndex);
        System.out.println(c);






    }
}

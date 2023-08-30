package class11;

public class E4StringMethod {
    public static void main(String[] args) {

        String str = "Batch 17 is A great batch. Just kidding. Please dont take it seriously";

       // String subStr=str.substring(0,4);      //  in index 0  the character is B, in index 4 the character is h,
                                                     // but it print  one number less from last index , it print batc,
        //System.out.println(subStr);

        String subStr=str.substring(27,39);
        System.out.println(subStr);

    }
}

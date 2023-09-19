package class11;

public class E4StringMethod {
    public static void main(String[] args) {

        String str = "Batch 17 is A great batch. Just kidding. Please dont take it seriously";

       // String subStr=str.substring(0,4);// 0, begin index,  4 end index
                                                     // but it print  one number less from last index , it print batc,
        //System.out.println(subStr);

        String subStr=str.substring(27,39);  // (begin index end index), (27,39)
        System.out.println(subStr);

    }
}

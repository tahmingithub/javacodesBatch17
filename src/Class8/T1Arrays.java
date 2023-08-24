package Class8;

public class T1Arrays {
    public static void main(String[] args) {

        // print the numbers in reverse order
        char [] chars={'A','B','C','f','E','#','@'};   //   index   0,1,2,3,4,5,6    , we have 7 element
        for (int i =chars.length-1; i>=0; i--) {  //    we start one less than  the size , we have 7 number , we start from 6 cuz
                                               //we have 6 index
                                               // we subtract -1 so because we have 6 index
            System.out.println(chars[i]);
        }
    }
}

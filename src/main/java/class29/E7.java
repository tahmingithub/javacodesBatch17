package class29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E7 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("1");

        int num1 = 10;
        int numb2 = 0;
        if (numb2 != 0) {
            System.out.println(num1 / numb2);
        }
        System.out.println(10 / 0);
        int[] arr = new int[-5];

        FileInputStream f = new FileInputStream("C//sdsds");  // check exception
        // Thread.sleep(2000);


    }
}

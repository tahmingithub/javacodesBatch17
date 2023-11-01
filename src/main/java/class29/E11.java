package class29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E11 {    // run time exception
    public static void main(String[] args) {

        String path=null;
        try {
            FileInputStream fis=new FileInputStream(path);
        } catch (FileNotFoundException e) {     // it print nullpoint exception in console.
            System.out.println("heheh");
        }

    }


}

    
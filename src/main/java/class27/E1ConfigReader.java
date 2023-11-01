package class27;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E1ConfigReader {
    public static void main(String[] args) throws IOException {
        // location of the  file
        //String path="/Users/tahmin/IdeaProjects/JavaBasics/Files/Config.properties";
        String path=System.getProperty("user.dir")+"/Files/Config.properties";
        // it moves the file from permanent storage in to the RAM
        // if you want to run anything on computer , first bring to ram, since Ram is fast ,
        FileInputStream fis= new FileInputStream(path);
        //class that interact with file, it helps to read write data from the file.
        // properties since it is inside the java, if it is excel we use XSSFWorkbook
        Properties properties= new Properties();   // properties => class  , create object of file
        //load the data from text file into the properties object
         properties.load(fis);           // create method
        System.out.println(properties.getProperty("userName"));
        System.out.println(properties.getProperty("password"));
        System.out.println(properties.getProperty("URL"));
       //java automatically moved from Ram to permanant storage
        //gives the location of your intetellij project on your computer
        System.out.println(System.getProperty("user.dir"));  // system =>class , dir =.directory


    }

}

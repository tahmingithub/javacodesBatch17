package review13;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E2Config {
    public static void main(String[] args)  {
        // right clik on  config.properties under Files package. Then click on copy path(location)
     String path= "/Users/tahmin/IdeaProjects/JavaBasics/Files/Config.properties"; // 1: path
        try(FileInputStream fis=new FileInputStream(path)){
        //2:bring to Ram, Plan A, the code that always cause problem inside try catch

     // check exception, uncheck exception,
         Properties properties =new Properties(); // 3: file that interact with files
         properties.load(fis); //   we load file// method //
         System.out.println(properties.getProperty("browser"));

     } catch(IOException io){  // plan B
         System.out.println("Please check the file that you are trying to read");
         // send an email or report to the team.
         // having a backup code like create a new file if the one from above path is not found.
     }

     }

    }




// Finally whatever code we put inside ,always executed
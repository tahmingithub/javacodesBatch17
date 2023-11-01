package class27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E3ConfigProperties {
    public  static void main(String[] args) throws IOException {
      //Open the browser on my computer
        String url=getProperty("URL");
        String userName=getProperty("userName");
        String password=getProperty("password");

        // open browser on my computer
        WebDriver driver=new ChromeDriver();
        //maximize browser
        driver.manage().window().maximize();
        //navigate to the url
        driver.get(url);
        //locate the   filed
        WebElement userNameField=driver.findElement(By.id("txtUsername"));
        // enter text in to the field
        userNameField.sendKeys(userName);
        WebElement passwordfield=driver.findElement(By.id("txtPassword"));
        passwordfield.sendKeys(password);
        WebElement loginBtn=driver.findElement(By.id("btnLogin"));
        loginBtn.click();
        driver.quit();

    }    //  method ,   static means no one can change it
    public static String getProperty(String propKey) throws IOException {
        String path=System.getProperty("user.dir")+"/files/config.properties";  // location
        FileInputStream fis = new FileInputStream(path);  // moved from permanent to Ram
        Properties prop = new Properties(); // call property class and creating pro object to use it to load hte file
        prop.load(fis);
        // it returns the value of the property that we provide in the parameter
        String value= prop.getProperty(propKey);
        return value;

    }
    public static String getProperty(String path,String propKey) throws IOException {
        FileInputStream fis = new FileInputStream(path);
        Properties prop = new Properties();
        prop.load(fis);
        //return the value of the property that we provide in the parameter
        String value = prop.getProperty(propKey);
        return value;
    }
}



package class27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2ConfigProperties {
    public static void main(String[] args) {


        String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard";
        String userName="Admin";
        String password="Hum@nhrm123";

       // open browser on my computer
        WebDriver driver=new ChromeDriver();
        //maximize browser
        driver.manage().window().maximize();
        //navigate to the url
        driver.get(url);
        //locate the textt filed
        WebElement userNameField=driver.findElement(By.id("txtUsername"));
        // enter text in to the field
        userNameField.sendKeys(userName);
        WebElement passwordfield=driver.findElement(By.id("txtPassword"));
         passwordfield.sendKeys(password);
         WebElement loginBtn=driver.findElement(By.id("btnLogin"));
         loginBtn.click();



    }
}

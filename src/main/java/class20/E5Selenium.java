package class20;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class E5Selenium {
    public static void main(String[] args) throws InterruptedException {

        ChromeDriver chrome=new ChromeDriver();
        chrome.manage().window().maximize();
        Thread.sleep(2000);
        chrome.navigate().to("https://google.com");
                System.out.println(chrome.getTitle());
        Thread.sleep(2000);
        chrome.navigate().to("https://facebook.com");
                System.out.println(chrome.getTitle());
        Thread.sleep(2000);
        chrome.navigate().to("https://amazon.com");
                System.out.println(chrome.getTitle());
        Thread.sleep(2000);
        chrome.navigate().back();
        chrome.close();

        FirefoxDriver firfox=new FirefoxDriver();
        firfox.manage().window().maximize();
        Thread.sleep(2000);
        firfox.navigate().to("https://google.com");
                System.out.println(firfox.getTitle());
        Thread.sleep(2000);
        firfox.navigate().to("https://facebook.com");
                System.out.println(firfox.getTitle());
        Thread.sleep(2000);
        firfox.navigate().to("https://amazon.com");
                System.out.println(firfox.getTitle());
        Thread.sleep(2000);
        firfox.navigate().back();
        firfox.close();
        firfox.close();
    }
}

package class21;

public class WebDriverTester {
    public static void main(String[] args) {
       // we use polymorphesim
     WebDriver [] arr={new ChromeDriver(),new FireFox()}; // new chromeDriver is new object
     for(WebDriver d:arr)   {
         d.openBrowser();   // d is variable
         d.loadURL(" Amazon.com");
         d.performTesting();
         d.close();
     }

// polymorphism we used same method giving different output.

    }
}

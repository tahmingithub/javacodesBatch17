package class21;

public abstract class WebDriver { // we have method overwriting
    abstract void openBrowser();  // we have method here in parent class then extend to child class

    abstract void loadURL(String url);// abstract means no body method
    abstract void performTesting();
    abstract void close();
}
 class ChromeDriver extends WebDriver{ //click error click on implements method then it gives you all method automatically

     @Override
     void openBrowser() {
         System.out.println("open Google Chrome browser");
     }

     @Override
     void loadURL(String url) {
         System.out.println("loading the URL"+ url);
     }

     @Override
     void performTesting() {
         System.out.println("perform Testing ");
     }

     @Override
     void close() {
         System.out.println("close the chrome browser");
     }
 }
 class FireFox extends WebDriver{

     @Override
     void openBrowser() {
         System.out.println("open the Firefox browser");
     }

     @Override
     void loadURL(String url) {
         System.out.println("loading the url in firefox" + url);
     }

     @Override
     void performTesting() {
         System.out.println("perform testing in firefox");
     }

     @Override
     void close() {
         System.out.println("closing the browser");
     }
 }
package class10;

public class PhoneTester {
    public static void main(String[] args) {

        Phone iphoneObj=new Phone();
        iphoneObj.make="Apple";
        iphoneObj.model="Iphone14";
        iphoneObj.price=999;
        iphoneObj.os="IOS 17";
        iphoneObj.call();
        iphoneObj.sendText();


        Phone pixelObj=new Phone();
        pixelObj.make="Google";
        pixelObj.model="Pixel 7";
        pixelObj.price=799;
        pixelObj.os="Android";
        pixelObj.call();
        pixelObj.sendText();

        Phone samsungObj= new Phone();
        samsungObj.make="sumsung";
        samsungObj.model= "S23 Ultra";
        samsungObj.price=333;
        samsungObj.os= "Andriod 13";
        samsungObj.call();
        samsungObj.sendText();
    }
}

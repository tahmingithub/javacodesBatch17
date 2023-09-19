package class22;

public class MovAbleTester {
    public static void main(String[] args) {

        MoveAble[]arr={new Car(),new Dog()};// array of parent
        for (MoveAble a:arr){ // enhanced
            a.move();
        }


    }
}

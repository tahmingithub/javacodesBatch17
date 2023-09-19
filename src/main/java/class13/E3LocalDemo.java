package class13;

public class E3LocalDemo {

    int sum = 0;

    void addElements() {   // creating method// in here it is local variable cuz it is inside block of code , method is block of code.
        int[] arr = {10, 20, 30};
        int sum = 0;  //local variable
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }

}
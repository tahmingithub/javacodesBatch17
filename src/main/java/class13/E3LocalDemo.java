package class13;

public class E3LocalDemo {

    int sum = 0;

    void addElements() {   // creating method
        int[] arr = {10, 20, 30};
        int sum = 0;  //local variable
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }

}
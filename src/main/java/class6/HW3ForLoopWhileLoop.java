package class6;

public class HW3ForLoopWhileLoop {
    public static void main(String[] args) {
        //print even numbers from 20 to 1 (using 2 different loops)

        for (int i = 20; i >= 1; i -= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        int i = 20;
        while (i > 1) {
            System.out.print(i + " ");
            i -= 2;


        }
    }
}
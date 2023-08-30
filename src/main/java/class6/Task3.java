package class6;

public class Task3 {
    public static void main(String[] args) {
// print only odd numbers from 100 to 1 (using 2 different loops)

        for (int i = 99; i >= 1; i -=2) {
            System.out.print(i+ " ");
        }
        System.out.println();
        int y=99;
        while (y>=1){// condition
            System.out.print(y + " ");  // print
            y-=2;// steps
        }

    }
}


package class6;

import java.util.Scanner;

public class E10whileLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the starting point");
        int start = scanner.nextInt();
        System.out.println("Please enter ending point");
        int end= scanner.nextInt();
        System.out.println("Please enter steps as well");
        int step=scanner.nextInt();

        while (start <= end) {     // starting point 5 ending point 50. steps 5,  => output, 5 10, 15
            System.out.print(start+ " ");
            start += step;
        }
    }
}


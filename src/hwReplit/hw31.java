package hwReplit;

import java.util.Scanner;

public class hw31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is it sunny outside?");

        boolean isSunny = scanner.nextBoolean();
        if (isSunny == true) {
            System.out.println("It is a sunny day, I should go somewhere!");
            System.out.println("What is the temperature outside?");
            double temperature = scanner.nextDouble();
            if (temperature > 85) {
                System.out.println("Im going to the beach!");
            } else {
                System.out.println("Im going to the park");
            }
        } else {
            System.out.println("I stay home and practice Java");
        }
    }
}
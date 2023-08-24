package hwReplit;

import java.util.Scanner;

public class hw36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Are you thirsty? (true/false)");
        boolean thirsty = scanner.nextBoolean();

        System.out.println("Are you sleepy? (true/false)");
        boolean sleepy = scanner.nextBoolean();

        String drink= " ";
        if (thirsty && !sleepy) {
            System.out.println(drink = "water" );
        } else if (thirsty && sleepy) {
            System.out.println (drink = "coffee");
        } else if (!thirsty && sleepy) {
            System.out.println(drink = "tea");
        } else {
            System.out.println(drink = "nothing");
        }
    }
}

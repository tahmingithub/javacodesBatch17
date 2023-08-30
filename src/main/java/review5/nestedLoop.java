package review5;

public class nestedLoop {
    public static void main(String[] args) {

        for (int a = 1; a > 3; a++) {   // inner print doesnt not print since outer loop is false
            System.out.println("hello");
            for (int b = 1; b <= 4; b++) {
                System.out.println("bye");


                for (int i = 1; i < 3; i++) {   //  hello 2 times  outer loop print
                    System.out.println("hello");
                    for (int j = 1; j <= 4; j++) {
                        System.out.println("bye");
                    }
                }
            }
        }
    }
}


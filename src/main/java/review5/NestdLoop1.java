package review5;

public class NestdLoop1 {
    public static void main(String[] args) {

        for (int i = 1; i < 3; i++) {
            System.out.println("hello");
            for (int j = 1; j <= 4; j++) {
                System.out.println("bye");
                break;
            }
        }
    }
}

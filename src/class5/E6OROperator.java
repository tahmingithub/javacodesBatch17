package class5;

public class E6OROperator {
    public static void main(String[] args) {

        String genre = "thriller";
        if (genre.equals("thriller") || genre.equals("Horror") || genre.equals("sci fi")) {
            System.out.println("im going to watch this movie");
        } else {
            System.out.println("I dont like this genre");

        }
    }

}
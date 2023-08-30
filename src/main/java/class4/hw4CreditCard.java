package class4;

import java.util.Scanner;

public class hw4CreditCard {
    public static void main(String[] args) {
/*
Create a Java program that will ask if user has a credit card or not.
 If you user does not have a credit card then offer them.
 If they do have one ask what is balance on the card? If balance of the card is larger than 1000,
  tell them to pay off immediately, otherwise you can tell them that they can spend more.
 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("if user has a credit card yes for 'Y' or NO as 'N' ");
        char value = scanner.next().charAt(0);
        if (value == 'Y') {
            System.out.println("What is the balance on the card?");

            double creditBalance = scanner.nextDouble();
            if (creditBalance > 1000) {
                System.out.println("Pay off immediately");
            } else {
                System.out.println("Spend more");
            }
        } else if (value == 'N') {
            System.out.println("We can offer you credit card");
        }
    }
}

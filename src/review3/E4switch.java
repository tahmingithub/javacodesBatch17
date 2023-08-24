package review3;

import java.util.Scanner;

public class E4switch {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter fruit name");
        String fruit=scanner.nextLine();

        switch(fruit){
            case "Orange":
                System.out.println("it is  usually Orange");
            break;
            case "Banana":
                System.out.println("Yellow Bananas are good");
            break;
            case "Strawberry":
                System.out.println("I like red Strawberries");
                break;

            default:
                System.out.println("I don't like this fruit");


        }
    }
}

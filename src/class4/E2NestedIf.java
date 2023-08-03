package class4;

public class E2NestedIf {
    public static void main(String[] args) {

        boolean winter = true;  // nested if statement is an if else statement inside another if or else statement.
        String jacketColor = "Black";   // Nested is like a doll , big doll and all small dolls by size inside
        // the big doll

        if (winter == true) {   //outer condition
            System.out.println("It is cold");
            if (jacketColor.equals("Red")) {
                System.out.println("Lets go with Red Nike shoes");// / inner condition

            } else {
                System.out.println("Lets go with blue ones");
            }
        } else {
            System.out.println("No need to wear jackets");

        }
    }
}
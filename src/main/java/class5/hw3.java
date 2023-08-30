package class5;

import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {

  /*
  Ask user to enter their country and capture it. Once values are captured print which language user speaks.
Allow user to enter grade (A, B, or C etc...) and then provide explanation:
 A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
 At the end your program should print which grade was entered by a user with explanation.
   */

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your country");
        String countryName=scanner.nextLine();
        System.out.println("which language user speaks");
        String language=scanner.next();
        System.out.println("Enter your grade, A,B,C,D,");
        String grade =scanner.next();
        if(grade.equals("A")){
            System.out.println("A-Excellent");
        }else if (grade.equals("B")){
            System.out.println("B-Good");
        }else if(grade.equals("C")){
            System.out.println("C-Average");
        }else if(grade.equals("D")){
            System.out.println("C-Bad");
        }else{
            System.out.println("not acceptable");
        }

    }
}

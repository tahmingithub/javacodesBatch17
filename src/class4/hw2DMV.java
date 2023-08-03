package class4;

import java.util.Scanner;

public class hw2DMV {
    public static void main(String[] args) {
/*   You are DMV representative and you need to ask customer their age.
If they are 18 and older you will issue a driver license to them,
otherwise you will offer them to get a learners permit.
 */
        Scanner scanner=new Scanner(System.in);
        System.out.println("you need to ask customer their age");
        int age= scanner.nextInt();
        if( age>=18){
            System.out.println("you will issue a driver license to them");

        }else{
            System.out.println("Offer them to get a Learner permit");
        }
    }
}

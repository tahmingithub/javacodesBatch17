package class5;

import java.util.Scanner;
/* prompt the user to enter person heights in inches. Person should be classified as one of the following:
short (under 60 inch)
Medium( between 60-72 inch)
tall(over 72)

 */
public class TaskHeight {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the person height in inches");// prompt the user

        Double  height=scanner.nextDouble();// to enter person heights in inches

        if( height<60){
            System.out.println("short");
        }else if(height>=60&&height<=72){
            System.out.println("medium");
        }else{
            System.out.println("tall");
        }
    }
}

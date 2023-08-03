package class4;

import java.util.Scanner;

public class E6Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your genderF/M");
        char gender=scanner.next().charAt(0);
        // charAt(0) means Tahmin it start with T, Tahmin, 012345, o mean T
        System.out.println("Your gender is "+ gender);



    }
}

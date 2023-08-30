package hwReplit;

import java.util.Scanner;

public class hw34 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter 3 distinct numbers");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int num3=scanner.nextInt();
        int largestNumber;

        if(num1>num2){
            if(num1>num3){
                largestNumber=num1;
            } else{
                largestNumber=num3;
            }
        }else
            if(num2>num3){
                largestNumber=num2;
            }else{
                largestNumber=num3;
            }
        System.out.println("The largest number is " + largestNumber);
        }
        }



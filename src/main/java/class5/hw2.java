package class5;

import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        /*
        Write a program that will read three inputs of scores (quiz, mid term, and final scores)
        and determine the grade based on the following rules:
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F
         */
      Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your quiz score");
        double quizScore=scanner.nextDouble();
        System.out.println("Enter your midterm score");
        double midtermScore=scanner.nextDouble();
        System.out.println("Enter your final score");
        double finalScore=scanner.nextDouble();
        double averageScore=(quizScore+midtermScore+finalScore)/3;

        if (averageScore>=90){
            System.out.println("grade A");
        }else if(averageScore>=70&&averageScore<90){
            System.out.println("grade B");
        }else if(averageScore>=50&&averageScore<70){
            System.out.println("grade C");
        }else if(averageScore<50){
            System.out.println("grade F");

        }


    }
}

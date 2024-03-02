package interview;

public class interview2 {
    public static void main(String[] args) {
        // write java program to print    first 10 numbers of fibonacci series.
        // fibonacci----=> each number is the sum of the two preceding ones,    0, 1, 1, 2, 3, 5, 8, 13, 21,

       int a,b,c;
        a=0;
        b=1;
        for (int i = 1; i <=10 ; i++) {
            System.out.println(a+ " ");
            c=a+b;
            a=b;
            b=c;




        }

    }
}

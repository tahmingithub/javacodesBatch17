package class6;

public class HW4ForLoopDoLoop {
    public static void main(String[] args) {
//Print odd numbers between 20 and 50 (using 2 different loops)
        for(int i=19; i<50; i+=2){
            System.out.print(i+ " ");
        }
        System.out.println();

        int i= 19;
        do{
            System.out.print(i+" ");
            i+=2;
        }while(i<50);
    }
}

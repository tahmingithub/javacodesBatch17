package Class8;

public class E10ContinueKeyword {
    public static void main(String[] args) {

        for (int i = 0; i <10 ; i++) {
            System.out.println("Batch 17 is Greatest of al time");
            if(i%2==0){    //  if i%2==0 means if any number divided by 2== 0 is an even number.
                continue;
            }
            System.out.println("I was kidding ");
        }
    }
}

package class5;

public class E8AndOperator {
    public static void main(String[] args) {

        boolean goodCredit=true;
        boolean stableJob=true;
        boolean minimumAge=false;
        if(goodCredit&&stableJob&&minimumAge){
            System.out.println("you can have the loan");
        }else{
            System.out.println("You need to fulfill all the requirements");
        }

    }
}

package class5;

/*

Write a program that will print whether it is a weekend or weekday.
If any day from 1-5> output "It is a weekday", any day from 6-7> output "It is a weekend" ,
any other day. output"Invalid day"
 */
public class TaskWeekend {
    public static void main(String[] args) {


        int day=5;
        if(day>1&&day<5){
            System.out.println("Weekdays");
        }else if (day==6||day==7){
            System.out.println("Weekend");
        }else{
            System.out.println("its invalid");
        }

    }
}

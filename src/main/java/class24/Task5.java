package class24;

import java.util.ArrayList;

public class Task5 {
    /*
    create an arrayList of even numbers from 1 to 500 using a loop. Then write another loop to  Remove any number
     that is divisible by 5 from that arrayList. divisible => capable of being divided by another number without a remainder.
     */
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 2; i <= 500; i+=2) {
            numbers.add(i);
        }
        System.out.println(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i)%5==0){
                numbers.remove(i);
            }
        }
        numbers.removeIf(x->x%5==0);   // Using   lambda expression
        System.out.println(numbers);
    }
}
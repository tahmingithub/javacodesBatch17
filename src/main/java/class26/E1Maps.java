package class26;

import java.util.HashMap;
// Important:  1: for  Maps we use put info in dictionary, no add method
//  2: for sets , we use add method ,we dont use get method,
public class E1Maps {
    public static void main(String[] args) {
     //when you see Hash word, meaning no asertion order(it prints out by order)
        HashMap<String, Double> fruit = new HashMap<>();               // HashMap => class, fruit and price of fruit
        fruit.put("Apple",8.0);  // we use put not add
        fruit.put("Banana",3.0);
        fruit.put("Orange",5.2);
        fruit.put("Kiwi",4.0); // For value you can have duplicated , but for keys no duplicated
        fruit.put("Apple",4.3);     // apple value override here thats why it prints 4.3
        System.out.println(fruit.size());    // it doesn't count the duplicated one
        System.out.println(fruit.containsKey("Apple"));
        System.out.println(fruit.containsValue(4.0));
        System.out.println(fruit.containsValue(44));
        System.out.println(fruit.isEmpty());
    }


}

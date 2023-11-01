package class25;

import java.util.HashSet;

public class E7Sets {
    public static void main(String[] args) {
// for HashSet we dont set for loop & while becuse it has indexes , so no index in hashSets becuase it is
       //  printing  without order , and does'nt accept duplicated element
       //ArrayList<DataType> nameForArrayList(variable)=new ArrayList<>();
        //LinkedList<DataType> nameForLinkedList=new LinkedList<>();
        //Arraylist, linkedlist and sets has the same formula
        //set<DataType> nameFor set(variable)=new set<>();
        HashSet<String> fruit = new HashSet<>();
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Banana");
        fruit.add("Banana");
        System.out.println(fruit);
          //1)No Duplicates 2) No Insertion Order/ no index allowed
        fruit.forEach(x -> System.out.println(x));    // lymba expression
        System.out.println("**");
        for (String f : fruit) {  // enhanced for loop
            System.out.println(f);
        }



    }
    }

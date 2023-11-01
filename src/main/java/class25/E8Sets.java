package class25;

import java.util.LinkedHashSet;

public class E8Sets {
    public static void main(String[] args) {
        // LinkedHashset print in order and doesnt accept  duplicate element
        LinkedHashSet<Integer> UniqueNumbers= new LinkedHashSet<>();
        UniqueNumbers.add(10);
        UniqueNumbers.add(20);
        UniqueNumbers.add(10);
        UniqueNumbers.add(30);
        System.out.println(UniqueNumbers);


    }
}

package interview;

public class StringName {
    public static void main(String[] args) {

        /*
         /*   ***My note Array Syntax***
    Datatype[] nameOfTHe Array={element1,element 2,element3}
        Method2:
        Datatype[] nameOfTHe Array=new DataType[size or number of elements that we store] */

        String name = "Tahmin";
        String reversed= " ";
        for (int i = name.length()-1; i >=0 ; i--) {
            reversed= reversed +name.charAt(i);
        }
        System.out.println(reversed);
        System.out.println("*****************");


        String name1="Barber";     // string      // String is not mutable (not changeable)
        name.toLowerCase();
        System.out.println(name1);

        StringBuilder sb= new StringBuilder("Sunday"); //  String builder is mutable means changeable,
        // meaning it changes from sunday to reverse sunday
        sb.reverse();
        //String builder is mutable changeable, easily change
        System.out.println(sb);

    }
}

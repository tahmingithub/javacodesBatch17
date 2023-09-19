package class12;

public class E3StringVsStringBuilder {
    public static void main(String[] args) {

        String name="Barber";     // string      // String is not mutable (not changeable)
        name.toLowerCase();
        System.out.println(name);

        StringBuilder sb= new StringBuilder("Sunday"); //  String builder is mutable means changeable,
                                                       // meaning it changes from sunday to reverse sunday
        sb.reverse();
                                                          //String builder is mutable changeable, easily change
        System.out.println(sb);

    }
}

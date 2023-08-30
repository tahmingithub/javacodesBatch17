package class12;

public class E3StringVsStringBuilder {
    public static void main(String[] args) {

        String name="Barber";     // string
        name.toLowerCase();
        System.out.println(name);

        StringBuilder sb= new StringBuilder("Sunday"); //  String builder is mutable means changeable,
                                                       // it change from sunday to reverse sunday
        sb.reverse();                                    // String not mutalbe (not changeable)
                                                          //String builder is mutalbe changeable, easily change
        System.out.println(sb);

    }
}

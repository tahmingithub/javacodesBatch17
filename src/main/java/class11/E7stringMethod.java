package class11;

public class E7stringMethod {
    public static void main(String[] args) {
        String str = "ks d nfjA ZSX232698 ()4!@# %^&A-S";
        System.out.println(str.replaceAll("[A-Z]", "="));
        System.out.println(str.replaceAll("[A-C]", "="));
        System.out.println(str.replaceAll("[a-z]", "="));
        System.out.println(str.replaceAll("[0-9]", ""));
        System.out.println(str.replaceAll("[&-;]", ""));
        System.out.println(str.replaceAll("[A-Z0-9]", ""));
        System.out.println(str.replaceAll("[A-Z0-58-9a-j]", ""));
        System.out.println(str.replaceAll("\\d", "")); // digit like 0-9
        System.out.println(str.replaceAll("\\s", "")); // space
        System.out.println(str.replaceAll("[^A-Z]", ""));   // A^ means not A to Z
        System.out.println(str.replaceAll("[^A-Za-z0-9]", ""));


    }
}






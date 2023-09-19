package class11;

public class E8StringMethod {
    public static void main(String[] args) {

        String str = "Hi There how are you.I am Good. I am Driving";
        String[] array = str.split("[.]");//separate by "." we change it to array to use indexes
        System.out.println(array.length);
        System.out.println(array[2]);
        System.out.println(array[2].trim());// there is space before Im so trim it means cut the space.




    }
}

package class11;

public class E9StringMethod {
    public static void main(String[] args) {


            String str = "Hi There how are you.I am Good. I am Driving";
        System.out.println(str.length());
            String[] array = str.split("[.\\s]");
            //  String[] array = str.split("[\\s]");
            System.out.println(array.length);
            // System.out.println(array[4]);
            for (String s : array) {
                System.out.print(s+ " ");
            }


        }
    }


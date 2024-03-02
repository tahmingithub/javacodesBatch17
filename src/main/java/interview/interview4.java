package interview;

public class interview4 {
    public static void main(String[] args) {

  // String reverse  // reverse name
       // two ways

        StringBuilder sb = new StringBuilder("Tahmin");
        sb.reverse();
        System.out.println(sb);


        String name="Tahmin";
        for (int i = name.length()-1; i >=0 ; i--) {
            System.out.print(name.charAt(i));

        }



        }

}




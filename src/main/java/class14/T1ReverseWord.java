package class14;
/*
How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever
 */
public class T1ReverseWord {
    public static void main(String[] args) {

        //       last index is always one less than length
        //String str = "This is sentence i want to reverse";
//        StringBuilder sb=new StringBuilder("This is sentence i want to reverse");
//        sb.reverse();
//        System.out.println(sb);

        String str = "This is sentence i want to reverse";
        String[] arr = str.split(" ");

        for (int i = 0; i < arr.length; i++) { // in array class , array is property, arr.length// str class , str is method
            String word = arr[i];
            String reversed = reverseStr(word);
            System.out.print(reversed + " ");
        }

    }

    static String reverseStr(String inputStr) { // reverseStr is method,inputStr is parameter

        String reversed = "";
        for (int i = inputStr.length() - 1; i >= 0; i--) {
            reversed = reversed + inputStr.charAt(i);
        }
        return reversed;
    }
}

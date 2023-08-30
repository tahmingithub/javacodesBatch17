package class9;

public class E22DArrays {
    public static void main(String[] args) {
        String[][] names =
                {      {"Hind", "Mikhail", "Ismael", "Ahmad"},
                        {"JOhn", "Bob", "Adam", "Tamim"},
                        {"Joke", "Laugh", "John Ahmad", "Mohammad"},
                        {"Gui", "Backend", "Front", "API"},
                };
        String[] row= names[2];      //  it prints a complete array
       // System.out.println(row[0]);
       // System.out.println(Arrays.toString(row));
        for(String name:row){      // column
            System.out.println(name);
        }
    }
}
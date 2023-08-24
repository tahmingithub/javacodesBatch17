package class9;

public class T32D {
    public static void main(String[] args) {
// create a 2D array(shorter way) in which first array will consist of 4 names and second array will contain grades.
        // then your program should print name of the students that has A and B grade.

        String[][] students={
                {"Aysha","Giulia", "John","Deepali"},
                {"A","A+","C","B"}
        };
        for (int i = 0; i <4 ; i++) {
            if(students[1][i].equals("A")||students[1][i].equals("B")){
            System.out.println(students[0][i]);}
        }



    }
}

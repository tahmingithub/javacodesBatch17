package Class8;

public class HW2 {
    public static void main(String[] args) {
//Create an array of names and store all names of your group.
// Then print your name from that array. (use 2 different ways of creating an array).
        String [] names={"Tahmin", "Jamel","Ehab","Ayesha", "Guilia","Madina"};
        System.out.println(names[0]);
        String [] groups= new String[6];
        groups[0]="Tahmin";
        groups[1]="Jamel";
        groups[2]="Ehab";
        groups[3]="Ayesha";
        groups[4]="Guilia";
        groups[5]="Madina";
        System.out.println(groups[0]);
    }
}

package class18;

public class Bird {     // Homework
    /*
    Create a Bird class create 4 fields and use the
Bird class as parent class and create 2 classes
Using it one sparrow and one parrot use constructors make fields private and define printInfo methods as well
 create the object of each class and call the methods
     */
    private String birdName;
    private String birdType;
    private String birdColor;
    private int birdAge;

    public Bird( String birdName, String birdType, String birdColor, int birdAge) {
        this.birdName = birdName;
        this.birdType = birdType;
        this.birdColor = birdColor;
        this.birdAge = birdAge;
    }

    public  void printInfo() {
        System.out.println(birdName + " " + birdType + " " + birdColor + " " + birdAge);
    }
}
class sparrow extends Bird{
    public sparrow(String birdName, String birdType, String birdColor, int birdAge )  {
        super(birdType, birdName, birdColor,birdAge );
    }
}
class parrot extends Bird {
    public parrot(String birdName, String birdType, String birdColor, int birdAge) {
        super(birdName, birdType, birdColor, birdAge);
    }


    public static void main(String[] args) {
        sparrow s = new sparrow("Mushimmo", "Passerine", "White", 1);
        s.printInfo();

        parrot p = new parrot("Cutie", "parrot", "Red", 3);
        p.printInfo();

    }
}




package class18;

public class GrandParent {
    public GrandParent(){   // constructor
        System.out.println("Granpa");
    }
}
class Parent extends GrandParent{   // constructor
    public Parent(){
        System.out.println("Parent");
    }
}

class Children extends Parent{
    Children(){
        System.out.println("Children");
    }
}
class Tester{
    public static void main(String[] args) {

        Children c=new Children();
    }
}
// it prints not only children because we cant create object of children without parents. children does not
// come to word without parents

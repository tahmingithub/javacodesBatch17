package class18;

public class Shape {  // Task
    /*
    Write program : Shape class has a constructor that takes the radius and has a subclass as circle class.
    In circle class create a method to calculate the area of circle. Test your code.
     */
    float radius=3;


}
class circle extends Shape{

    void area(){
        double area=radius*radius*Math.PI;
        System.out.println("Area of circle : " + area);
    }
}
class test{
    public static void main(String[] args) {
        circle obj=new circle();
        obj.area();

    }
}


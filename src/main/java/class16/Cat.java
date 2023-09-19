package class16;

public class Cat {
    private String name;
    private String nickName;  // instance variable
    private String color;
    private int age;
    private char gender;
    private double weight;

    public void printInfo(){
        System.out.println(name+" "+nickName+" "+color+" "+age+" "+gender+" "+weight);
    }
    public Cat (){
    }
    public Cat (String name,String nickName,String color, int age){  // we have name in parameter
        this.name=name;  //  we have same name in paramater and in instance varialbe so java get confuse so we use this word
        this.nickName=nickName; //  this means take the value from instance variable// instance variable is in the top
        this.color=color;
        this.age=age;
    }
    public Cat (String name,String nickName,String color, int age, char gender){
        this(name, nickName, color, age);
        this.gender=gender;
    }
    public Cat (String name,String nickName,String color, int age, char gender, double weight){
        this(name, nickName, color, age, gender);
        this.weight=weight;

    }

}

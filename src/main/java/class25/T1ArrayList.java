package class25;

import java.util.LinkedList;
/*
create a cat class create 3 fields a constructor and printInfo method inside it . create three object from this class
store them inside the LinkedList and call printInfo method using these three objects.
 */
public class T1ArrayList {
    public static void main(String[] args) {

            LinkedList<Cat> cats = new LinkedList<>();

            cats.add(new Cat("Tom,",10, "Grey"));// creating object &storing them
            cats.add(new Cat("Sam", 12, "Brown"));
            cats.add(new Cat("Nagi", 12, "Orange and White"));

      /*  for (Cat cat : cats) {
            cat.printInfo();
        }*/
            cats.forEach(x->x.printInfo());
        }
    }
    class Cat{
        private String name;
        private   int age;
        private String breed;

        public Cat(String name, int age, String breed) {
            this.name = name;
            this.age = age;
            this.breed = breed;
        }

        public void printInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Breed: " + breed);

        }
    }



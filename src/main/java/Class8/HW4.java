package Class8;

public class HW4 {
    public static void main(String[] args) {
        //create an array of cars and store 6 elements into it.
        // Using 2 different loops print all values from the array.
        String []cars={"BMW","Toyota","Mercedes","Suv","Tesla"};
        for (int i = 0;  i< cars.length ; i++) {
            System.out.print(cars[i]+ " ");
        }
        System.out.println();

        int j=0;
        while(j< cars.length){
            System.out.print(cars[j]+" ");
            j++;

        }


    }
}

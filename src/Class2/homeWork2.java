package Class2;

public class homeWork2 {
    public static void main(String[] args) {

        float Price=8.2f;
        float multiply=8.2f*8.2f;
        System.out.println("The multiplication of " + Price+ " with itself is equal to " + multiply);
//
        int n1 = 200;
        int n2 = 100;
        System.out.println(n1+n2);
        System.out.println(n1-n2);
        System.out.println(n1*n2);
        System.out.println(n1/n2);
//

        int num1 = 3;
        int num2 = 7;
        int num3 = 5;
        int num4 = 1;
        int result;
//      add num1 and num2
        result=num1+num2;
 //     divide the result by num3
        result=result/num3;
//subtract num4 from the result
        result=result-num4;
        //output the result of arithmetic operations is equal to ---
        System.out.println("The result of arithmetic operations is equal to "+ result);

//write a program to print the perimeter and ara of a rectangle with width
        //=5 and height =8.
        //output: the perimeter if a rectangle with width --and
        //height --- is equals to --- and the area equals to --.
        int width =5;
        int height= 8;

        int area= width*height;
        int perimeter = 2* (width+height);

        System.out.println(" The perimeter of a rectangle with width " + width+ " and height "  + height + " is equal to "  + perimeter + " and the area equals to "+area) ;
//
///Create an int variable called myNumber. Set it equal to any number other than 0.
//2. We will refer to myNumber as the _original number_ from now on.
//3. Create an int variable called stepOne. Set it equal to the original number (myNumber) multiplied by itself.
        int myNumber=56;
        int stepOne=myNumber*myNumber;
        int stepTwo=stepOne+myNumber;
        int stepThree=stepTwo/myNumber;
        int stepFour=stepThree+17;
        int stepFive=stepFour-myNumber;
        int stepSix=stepFive/6;
        System.out.println("The magic number is "+ stepSix+ "!");




    }



}

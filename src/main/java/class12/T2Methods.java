package class12;

public class T2Methods {
    /*
    create a method that will take two int numbers as input and returns the larger number
    call the method in a different class and print the result
     */

    int getLarger(int num1, int num2) {
        int res;
        if (num1 > num2) {
            res=num1;
        }else{
            res=num2;
        }
    return res;
    }

    /*
 Create a method createEmail(). Based on values of users
 firstName, lastName and email type, your method should return
 complete email Address. Example:  createEmail(John, Snow, gmail)
  → johnsnow@gmail.com
 */

    String createEmail(String fName, String lName, String emailType){
        String result;

       return fName+lName+" @"+ emailType+ ".com";

    }
}
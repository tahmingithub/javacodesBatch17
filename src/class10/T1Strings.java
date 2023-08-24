package class10;

public class T1Strings {
    public static void main(String[] args) {
        /*   Store username, password and confirm password from a user and check following requirements:
Username or Password cannot be  empty, if so→ message=”Username or Password cannot be empty”.
Password should be minimum 8 characters, if less → message=”Password is too short”.
Password cannot contain username if so, → message=”Password cannot contain username”.
Password should match confirmed password, if not  → message=“Passwords do not match”.

Only after all requirements met → message “Your username and password has been created”
         */
      String userName="Tah12";
      String pass="Pass1234";
      String confirmPass="Pass1234";

      if(userName.isEmpty()||pass.isEmpty()) {
          System.out.println("User or password cannot be empty");
      }else if(pass.length()<8){
              System.out.println("Password is too short");
          }else if(pass.contains(userName)){
          System.out.println("Pass can not contain username");
         }else if (!pass.equals(confirmPass)) {
          System.out.println("Pass do not match");
      }else{
          System.out.println("your user and pass has been created");


      }
      }

    }

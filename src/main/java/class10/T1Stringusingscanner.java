package class10;

import java.util.Scanner;
/*
*   Store username, password and confirm password from a user and check following requirements:
Username or Password cannot be  empty, if so→ message=”Username or Password cannot be empty”.
Password should be minimum 8 characters, if less → message=”Password is too short”.
Password cannot contain username if so, → message=”Password cannot contain username”.
Password should match confirmed password, if not  → message=“Passwords do not match”.

Only after all requirements met → message “Your username and password has been created”
         */
public class T1Stringusingscanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter username");
        String username= scanner.nextLine();
        System.out.println("enter pass");
        String password=scanner.nextLine();
        System.out.println("Please confirm the password");
        String confirmPass=scanner.nextLine();
        if(username.isEmpty()||password.isEmpty()){
            System.out.println("username or password can not be empty.");
        }else if(password.length()<8){
            System.out.println("Password is too short");
        }else if(password.contains(username)){
            System.out.println("Password can not contain username");
        }else if(!password.equals(confirmPass)){
            System.out.println("Password do not match");
        }else{
            System.out.println("your username and password has been created");
        }
    }
}

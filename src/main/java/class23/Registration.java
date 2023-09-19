package class23;
/*
create Registration class in which you would have variables as email, uerName and password that have an access scope
only within its own class. After creating an object of the class user should be able to call methods and in each method
separately pass values to set users email , username and password.
requirements:
A: valid email consider to be yahoo
B: valid userName and password cannot be empty and should be of length larger than 6 characters. also valid password
cannot contain uerName.
 */
public class Registration {
    private String email;
    private String userName;
    private String password;

    public Registration(String email, String userName, String password) {// constructor initialize field
        setEmail(email);
        setUserName(userName);
        setPassword(password);
    }

    public void setEmail(String email) { //  3 set method that has set

        if (email.contains("yahoo")){
            this.email = email;
        }else{
            System.out.println("not a accepted email provider");
        }
    }

    public void setUserName(String userName) {

        if(!userName.isEmpty()&& userName.length()>6){
            this.userName = userName;
        }else{
            System.out.println("Username does not meet requirements.");
        }
    }

    public void setPassword(String password) {

        if(!password.isEmpty()&& password.length()>6&& password!=userName){
            this.password = password;
        }else{
            System.out.println("Password does not meet requirements.");
        }
    }

    public String getEmail() {  // 3 get method to get the method
        return email;
    }
    public String getUsername() {
        return userName;
    }
    public String getPassword() {
        return password;
    }

}


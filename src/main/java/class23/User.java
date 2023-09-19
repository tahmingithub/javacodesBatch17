package class23;

public class User {  //  role encapsulation  1:  create class , encapsulation we use setter and getter
    private String name;      // field make field private
    private int age;
    private String userName;
    private String password;

    public User(String name, int age, String userName, String password) { // create constructor
        setAge(age); // we set to change it
        setName(name); // set method inside constructor
        setUserName(userName);
        setPassword(password);
    }

    public String getName() {  //click then click getter setter , automatically getter setter come,  create getter setter method ,
        return name;    // above getter method of name
    }
// 4 method for setter and 4 method for getter for all field
    public void setName(String name) { // setter method of name
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


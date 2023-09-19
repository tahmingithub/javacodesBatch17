package class16;

public class Book {   // constructor , the name of method is the same as class name
    /*
    Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
     */

    private String bookName;

   private  String authorName;
   private int bookPrice;
    public Book (String bookName, String authorName, int bookPrice) {
        this.bookName = bookName;   // this means instance variable
        this.authorName=authorName;
        this.bookPrice=bookPrice;
    }
    public Book(String bookName,  String authorName){
        this.bookName=bookName;
        this.authorName=authorName;
    }
    public void printInfo(){
        System.out.println(bookName+ " " + authorName+ " " +bookPrice);
    }


}

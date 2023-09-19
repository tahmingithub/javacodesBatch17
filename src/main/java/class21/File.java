package class21;
/*
Create a class File that will have the following behaviors: open(), edit(), close() and fields like name and size.
 Edit and close are implemented method while open is an abstract. Create 3 subclasses: JavaFile, WordFile, PdfFile
 that will provide specific implementation of open behaviour: Example: to open .java file we need notepad++
 or sublime text, to open .doc file we need Microsoft word to be installed etc.
 Create a tester class and call all of the methods from these classes.
 */
public abstract  class File {
   private  String name;
   private int size;  // click on generate then click constructor , it creates automatically constructor for you.
   public File(String name,int size ){   //we create constructor
       this .name=name; // this means calling to the instance variable
       this.size=size;
   }
    public abstract void open(); // open method is abstruct means no body method
     public  void edit(){ // edit and close method are implement meaning it hs body method
          System.out.println("editing file" + name);  // we use method cuz we want to reuse something again
    };
    public  void close(){
         System.out.println("closing  file " + name);
     };
}
 class JavaFile extends File{
     public JavaFile(String name, int size) {
         super(name, size);// super calling constructor of parent class
     }
     @Override
     public void open() {
         System.out.println("opening java file using intellij");
     }
 }

class WordFile extends File{
    public WordFile(String name, int size) {
        super(name, size);
    }
    @Override
    public void open() {
        System.out.println("opening Wordfile using Microsoft word");
    }
}
  class PDFFile extends File{
    public PDFFile(String name, int size){
        super(name, size);
    }
      @Override
      public void open() {
          System.out.println("opening  PDFFile using Adobe");
      }

  }

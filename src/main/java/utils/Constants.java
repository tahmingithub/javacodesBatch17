package utils;

public class Constants { // // utils contains all the classes that contain method and code  that we can reuse it over and over.
                  //we write our mehhod
    public static  final  String CONFIG_FILE_PATH= System.getProperty("user.dir")+"File/config.properties";   // static-> dont need object , ehen variabel is final string =.>use upper case
//public ->we can  access it from everywhere
    // static -> we dont need to create object
     // final -> no one change it
    public static final String EXCEL_FILE_PATH =System.getProperty("user.dir")+"Files/Employees.xlsx" ;
}

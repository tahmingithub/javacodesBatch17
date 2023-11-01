package class28;

import utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelReaderTester {
    public static void main(String[] args) throws IOException {
// method , readExcelData => name of method
      List<Map<String, String>> data=ExcelReader.readExcelData("/Users/tahmin/IdeaProjects/JavaBasics/Files/Employees.xlsx","empData");
                                        //empData is the name of the sheet
      System.out.println(data);

      System.out.println("*****************************************");

            // **class Task **
        //Create an excel file store some data inside it and read that data using
        //the methods that we have just  created.
        //Method
        List<Map<String,String>> data1= ExcelReader.readExcelData("/Users/tahmin/IdeaProjects/JavaBasics/Files/Sales.xlsx");
        System.out.println(data1);
    }
}




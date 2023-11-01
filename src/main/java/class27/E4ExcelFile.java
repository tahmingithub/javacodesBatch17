package class27;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class E4ExcelFile {
    public static void main(String[] args) throws IOException {
        String path ="/Users/tahmin/IdeaProjects/JavaBasics/Files/Employees.xlsx"; //location of file

        FileInputStream fis=new FileInputStream(path); // moved  permanent storage to Ram
       // we use differnet software application to read file
        XSSFWorkbook workbook= new XSSFWorkbook(fis);// => // software or a class that know how to handle, fis object
        //
        // call method
        // what type of file we are using
        // file is extension of xlsx
        Sheet sheet1 =workbook.getSheet("Sheet1");
        Row row= sheet1.getRow(1); // row 1
        Cell cell = row.getCell(2); // column 2
        System.out.println(cell);




    }
}

package review13;

import utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class E5Excel {
    public static void main(String[] args) throws IOException {


                List<Map<String,String>> data= ExcelReader.readExcelData
                        ("/Users/tahmin/IdeaProjects/JavaBasics/Files/Employees.xlsx","EmpData");
                System.out.println(data);
            }
        }

package dataDrivenTesting;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadMultipleData 
{
public static void main(String[] args) throws Exception 
   {
     FileInputStream fis= new FileInputStream("./excel/Links.xlsx");
     XSSFWorkbook book = new XSSFWorkbook(fis);
     XSSFSheet sheet = book.getSheet("Selenium Testing");
     int last = sheet.getLastRowNum();
     for(int i=0;i<=last;i++)
     {
    	 XSSFRow row = sheet.getRow(i);
    	 XSSFCell cel = row.getCell(0);
    	 String value = cel.getStringCellValue();
    	 System.out.println(value);
	 }
     book.close();
     fis.close();
   }
}

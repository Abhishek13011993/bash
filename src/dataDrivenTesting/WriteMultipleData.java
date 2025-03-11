package dataDrivenTesting;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WriteMultipleData 
{
public static void main(String[] args) throws IOException, InterruptedException 
  {
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.flipkart.com/");
	List<WebElement> links = driver.findElements(By.xpath("//a"));
  	XSSFWorkbook book=new XSSFWorkbook();
  	XSSFSheet sheet = book.createSheet("Selenium Testing");
  	int ls = links.size();
  	for(int i=0;i<ls;i++)
  	{
  	XSSFRow row = sheet.createRow(i);
  	XSSFCell cel = row.createCell(0);
  	WebElement link = links.get(i);
  	String url = link.getAttribute("href");
  	cel.setCellValue(url);
  	}
    FileOutputStream fos=new FileOutputStream("./excel/Links.xlsx");
    book.write(fos);
    book.close();
    fos.close();
    Thread.sleep(2000);
    driver.quit();
    }
}

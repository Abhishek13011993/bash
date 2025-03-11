package Dropdowns;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SortMonthsTreeSet 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		WebElement ele = driver.findElement(By.xpath("//select[@title='Month']"));
		Select s=new Select(ele);
		List<WebElement> opt = s.getOptions();
		TreeSet<String> t= new TreeSet<String>();
		for (WebElement we : opt) 
		{
		  String text = we.getText();	
		  t.add(text);
		}
		for (String t1 : t) 
		{
			System.out.println(t1);
		}
		driver.quit();
	}
}

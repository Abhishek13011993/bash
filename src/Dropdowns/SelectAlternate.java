package Dropdowns;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAlternate 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		WebElement ele = driver.findElement(By.xpath("//select[@title='Month']"));
		Select s=new Select(ele);
		List<WebElement> opt = s.getOptions();
		
		for(int i=0;i<opt.size();i++)
		{
			if(i%2==0)
			{
			s.selectByIndex(i);
			Thread.sleep(2000);
			}
		}
		driver.quit();
	}
}

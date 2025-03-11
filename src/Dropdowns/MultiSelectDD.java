package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDD 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/kumar/Downloads/dropdownmulti.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.id("nandanas"));
		Select s=new Select(ele);
		boolean b = s.isMultiple();
		if(b)
		{
			System.out.println("It is a multi select dropdown");
		}
		else
		{
			System.out.println("It is not a multi select dropdown");
		}
		driver.quit();
	}
}

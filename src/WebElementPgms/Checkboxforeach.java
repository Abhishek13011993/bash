package WebElementPgms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkboxforeach 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/kumar/Downloads/checkbox.html");
		List<WebElement> eles = driver.findElements(By.xpath("//input[@type='checkbox']"));
	    for (WebElement we : eles) 
	    {
			we.click();
		}
	    Thread.sleep(1000);
	    for (WebElement we : eles) 
	    {
			we.click();
		}
		Thread.sleep(1000);
		driver.quit();
	}

}

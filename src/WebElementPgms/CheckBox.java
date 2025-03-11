package WebElementPgms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/kumar/Downloads/checkbox.html");
		List<WebElement> eles = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i=0;i<eles.size();i++)
		{
			eles.get(i).click();
			Thread.sleep(1000);
		}
		for(int i=eles.size()-1;i>=0;i--)
		{
			eles.get(i).click();
			Thread.sleep(1000);
		}
		Thread.sleep(1000);
		driver.quit();
	}
}

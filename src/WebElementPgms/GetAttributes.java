package WebElementPgms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAttributes 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		List<WebElement> links= driver.findElements(By.xpath("//a"));
		for(int i=0;i<links.size();i++)
		{
		   WebElement we = links.get(i);
		   System.out.println(we.getAttribute("href"));
		}
		
	   	System.out.println("from here image source will be displayed");
		List<WebElement> links1= driver.findElements(By.xpath("//img"));
		for(int i=0;i<links1.size();i++)
		{
		   WebElement we = links1.get(i);
		   System.out.println(we.getAttribute("src"));
		   
		}
		driver.quit();
	}
}

package WebElementPgms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElements2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.findElements(By.xpath("//img")).size());
		
		
		
		
		driver.get("https://www.amazon.in/");
		List<WebElement> links= driver.findElements(By.xpath("//a|//img"));
		System.out.println(links.size());
			
		Thread.sleep(2000);
		driver.quit();
	}
}

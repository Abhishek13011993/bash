package WebElementPgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://web.umang.gov.in/landing/");
		WebElement ele = driver.findElement(By.xpath("//div[text()=' Services by States ']"));
		boolean b = ele.isDisplayed();
		if(b)
		{
			System.out.println("Element displayed");
		}
		else
		{
			System.out.println("element not displayed");
		}
	}
}

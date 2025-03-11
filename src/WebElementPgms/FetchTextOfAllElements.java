package WebElementPgms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FetchTextOfAllElements 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	List<WebElement> links= driver.findElements(By.xpath("//a"));
	/*for(int i=0;i<links.size();i++)
	{
	   WebElement we = links.get(i);
	   System.out.println(we.getText());
	}*/
	for(int i=links.size()-1;i>0;i--)
	{
	   WebElement we = links.get(i);
	   System.out.println(we.getText());
	}
		
	Thread.sleep(2000);
	driver.quit();
}
}

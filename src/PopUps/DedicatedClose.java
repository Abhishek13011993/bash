package PopUps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DedicatedClose 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.findElement(By.name("NewWindow")).click();
		Set<String> allwh = driver.getWindowHandles();
		System.out.println(allwh.size());
		Thread.sleep(2000);
	    for (String wh : allwh) 
	    {
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			Thread.sleep(2000);
			if(title.equals("About me - qavalidation"))
			{
			driver.close();
			}
		}
	}
}

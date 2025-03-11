package PopUps;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountTheBrowsers 
{

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.findElement(By.name("NewWindow")).click();
		Set<String> allwh = driver.getWindowHandles();
		System.out.println(allwh.size());
	    for (String wh : allwh) 
	    {
			System.out.println(wh);
		}
	    Thread.sleep(2000);
	    driver.quit();
	}
}

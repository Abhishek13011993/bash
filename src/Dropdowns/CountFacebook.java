package Dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CountFacebook 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		WebElement ele = driver.findElement(By.xpath("//select[@title='Year']"));
		Select s=new Select(ele);
	    List<WebElement> opt = s.getOptions();
	    System.out.println(opt.size());
	    for (WebElement we : opt) 
	    {
			System.out.println(we.getText());
		}
	    driver.quit();
	}
}

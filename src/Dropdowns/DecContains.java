package Dropdowns;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DecContains 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		WebElement ele = driver.findElement(By.xpath("//select[@title='Month']"));
		Select s=new Select(ele);
		List<WebElement> opt = s.getOptions();
		ArrayList<String> a=new ArrayList<String>();
		for (WebElement we : opt) 
		{
			String text = we.getText();
			a.add(text);
		}
		boolean d = a.contains("Dec");
		if(d)
		{
			System.out.println("December is present");
		}
		else
		{
			System.out.println("December is not present");
		}
		driver.quit();
	}
}

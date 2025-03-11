package WebElementPgms;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllInOne 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoapps.qspiders.com/ui/button?sublist=0");
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("(//button[text()='Yes'])[1]"));
		boolean d = ele.isDisplayed();
		if(d)
		{
			System.out.println("displayed");
		}
		else
		{
			System.out.println("not displayed");
		}
		Thread.sleep(3000);
		boolean e = ele.isEnabled();
		if(e)
		{
			System.out.println("enabled");
		}
		else
		{
			System.out.println("not enabled");
		}
		Thread.sleep(3000);
		boolean s = ele.isSelected();
		if(s)
		{
			System.out.println("selected");
		}
		else
		{
			System.out.println("not selected");
		}
		System.out.println();
		System.out.println(ele.getAttribute("id"));
		System.out.println(ele.getTagName());
		System.out.println(ele.getText());
		
		System.out.println();
		Point loc = ele.getLocation();
		System.out.println(loc);
		System.out.println(loc.getX());
		System.out.println(loc.getY());
		System.out.println();
		
		System.out.println(ele.getCssValue("outline"));
		System.out.println();
		
		System.out.println("hight"+ele.getSize().getHeight());
		System.out.println("width"+ele.getSize().getWidth());
		System.out.println();
		
		Thread.sleep(2000);
		driver.navigate().to("https://demoapps.qspiders.com/ui/link?sublist=0");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		Dimension Dw=new Dimension(500,400);
		driver.manage().window().setSize(Dw);	
		
	    Point p=new Point(200, 400);
	    driver.manage().window().setPosition(p);
	    Thread.sleep(2000);
	    
	    driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		driver.quit();
		
	}
}

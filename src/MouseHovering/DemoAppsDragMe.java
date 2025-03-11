package MouseHovering;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoAppsDragMe 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/dragDrop?sublist=0");
		WebElement dragMe = driver.findElement(By.xpath("//div[text()='Drag Me']"));
		Actions act=new Actions(driver);
		act.dragAndDropBy(dragMe, 200,100).perform();
		Thread.sleep(1000);
		driver.quit();
	}
}

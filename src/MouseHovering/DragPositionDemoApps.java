package MouseHovering;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragPositionDemoApps 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=2");
		WebElement sel1 = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement sel2 = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement sel3 = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		WebElement sel4 = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement dst = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		WebElement dst2 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
	
		Actions act=new Actions(driver);
		act.dragAndDrop(sel1, dst).perform();
		Thread.sleep(2000);
		act.dragAndDrop(sel4, dst).perform();
		Thread.sleep(2000);
		act.dragAndDrop(sel2, dst2).perform();
		Thread.sleep(2000);
		act.dragAndDrop(sel3, dst2).perform();
		Thread.sleep(2000);
		driver.quit();
	}
}

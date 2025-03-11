package MouseHovering;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightclickKannada 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		WebElement rClick = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
		Actions act=new Actions(driver);
		act.contextClick(rClick).perform();
		Robot r=new Robot();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_T);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(2000);
		driver.quit();
	}
}

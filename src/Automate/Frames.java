package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames 
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/kumar/Downloads/Mainpage.html");
		driver.findElement(By.className("t1")).sendKeys("admin");
		Thread.sleep(2000);
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("f1");
		//driver.switchTo().frame("frame1");
		WebElement f1 = driver.findElement(By.id("f1"));
		driver.switchTo().frame(f1);
		driver.findElement(By.className("t2")).sendKeys("admin@1234");
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.className("t3")).sendKeys("admin@1234");
		
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.findElement(By.className("t2")).clear();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.findElement(By.className("t1")).clear();
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}
}

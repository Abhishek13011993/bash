package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shopperstack 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(6000);
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[@href='/men']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//img[@alt='footwear']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath(""))
	}
}

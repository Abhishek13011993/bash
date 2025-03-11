package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.get("https://www.instagram.com/accounts/login/?hl=en");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("label[class='_aa48']")).sendKeys("kumarswamy");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("kumarswamy");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	Thread.sleep(2000);
	driver.quit();
	
}
}

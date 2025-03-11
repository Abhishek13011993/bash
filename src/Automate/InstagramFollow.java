package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramFollow 
{
public static void main(String[] args) throws InterruptedException 
{

	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.get("https://www.instagram.com/accounts/login/?hl=en");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[@class='_aa48']")).sendKeys("kumarrpatil2000@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Kumarswamy@1932");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(4000);
	//driver.findElement(By.xpath("//span[text()='Home']")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Search']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("kiccha");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[.='KicchaSudeepa • 2.4M followers']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[.='Follow']")).click();
	Thread.sleep(2000);
	driver.quit();
	
}
}

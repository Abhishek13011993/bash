package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassValue 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	Thread.sleep(1000);
	driver.findElement(By.id("email")).sendKeys("kumarrpat");
	driver.findElement(By.id("pass")).sendKeys("1234");
	driver.findElement(By.name("login")).click();
	}
}
//to open
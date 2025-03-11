package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CssSelector 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
    driver.get("https://www.facebook.com");
    Thread.sleep(1000);
    driver.findElement(By.cssSelector("input[id='email']")).sendKeys("Kumarswamy");
    driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("12345");
    driver.findElement(By.cssSelector("button[name=login]")).click();
    
}
}
package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMaps 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.get("https://www.google.com/maps/@13.008896,77.5192576,12z?entry=ttu&g_ep=EgoyMDI0MTIwMi4wIKXMDSoASAFQAw%3D%3D");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id='hArJGc']")).click();
	Thread.sleep(8000);
	driver.findElement(By.xpath("//span[@class='OzmNAc google-symbols SwaGS']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@tooltip='Choose starting point, or click on the map...']")).sendKeys("Bengaluru");
	Thread.sleep(4000);
	WebElement m=driver.findElement(By.xpath("//input[@tooltip='Choose destination, or click on the map...']"));
	m.sendKeys("Haveri");
	Thread.sleep(4000);
	m.sendKeys(Keys.ENTER);
	Thread.sleep(4000);
    driver.quit();
	
}
}

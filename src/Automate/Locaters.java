package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaters 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/kumar/Downloads/Textfield.html");
	Thread.sleep(2000);
	//driver.findElement(By.tagName("a")).click();
	driver.findElement(By.id("a1")).click();
	//driver.findElement(By.name("n1")).click();
	//driver.findElement(By.className("c1")).click();
}
}

package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoAppsPractice 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//select[@id='select2']"));
		Select s=new Select(ele);
		s.selectByVisibleText("Male");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
		Thread.sleep(2000);
		WebElement ele2 = driver.findElement(By.id("select-multiple-native"));
		Select s1=new Select(ele2);
		s1.selectByVisibleText("Jeans");
		Thread.sleep(2000);
		s1.selectByVisibleText("Sneakers");
		Thread.sleep(2000);
		s1.selectByIndex(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Search With Select']")).click();
		Thread.sleep(2000);
		WebElement ele3 = driver.findElement(By.xpath("//div[text()='Select Gender']"));
		ele3.sendKeys("Male");
		//not complete
		
		driver.quit();
	}
}

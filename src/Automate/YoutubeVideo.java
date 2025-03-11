package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class YoutubeVideo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='search']")).sendKeys("kantara songs");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[id='video-title']")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("button[title='I like this']")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
	}
}

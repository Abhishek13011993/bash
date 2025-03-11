package Automate;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Both 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.close();
	
	Thread.sleep(2000);
	
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	FirefoxDriver driver1=new FirefoxDriver();
	Thread.sleep(2000);
   }
}


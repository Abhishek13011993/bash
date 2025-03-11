package Automate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseExecute 
{
	public static void main(String[] args) throws InterruptedException 
	{
	 System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		String M = driver.getTitle();
		if(M.equals("Facebook – log in or sign up"))
		{
			System.out.println("test case pass");
		}
		else
		{
			System.out.println("test case fail");
		}
		
		if(M.contains("log in"))
		{
			System.out.println("test case pass");
		}
		else
		{
			System.out.println("test case fail");
		}
		driver.quit();
	}	
}

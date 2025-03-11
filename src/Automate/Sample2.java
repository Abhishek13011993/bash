package Automate;

import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.close();

	}
}

package Automate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TogetSourceCode 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.gmail.com");
	Thread.sleep(1000);
	driver.manage().window().maximize();
	String src = driver.getPageSource();
	System.out.println(src);
	
}
}

package Automate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Urlentered 
{
public static void main(String[] args) 
 {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	//System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	
 }
}

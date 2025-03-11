package WebElementPgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://web.umang.gov.in/landing/");
	WebElement ele = driver.findElement(By.xpath("//button[text()=' Login/Register ']"));
	System.out.println(ele.getAttribute("class"));
	Thread.sleep(2000);
	driver.close();
	}
}

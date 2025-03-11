package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoApps 
{
public static void main(String[] args) throws InterruptedException 
{
   System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
   WebDriver driver=new FirefoxDriver();
   driver.get("https://demoapps.qspiders.com/ui?scenario=1");
   Thread.sleep(1000);
   driver.findElement(By.id("name")).sendKeys("Kumarswamy");
   Thread.sleep(1000);
   driver.get("https://demoapps.qspiders.com/ui/button");
   Thread.sleep(2000);
   driver.findElement(By.id("btn")).click();
   Thread.sleep(2000);
   driver.findElement(By.id("btn2")).click();
   driver.get("https://demoapps.qspiders.com/ui/radio?sublist=0");
   Thread.sleep(2000);
   driver.findElement(By.id("attended")).click();
   driver.get("https://demoapps.qspiders.com/ui/checkbox?sublist=0");
   Thread.sleep(2000);
   driver.findElement(By.id("domain1")).click();
   driver.quit();
}
}

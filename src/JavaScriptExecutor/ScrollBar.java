package JavaScriptExecutor;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollBar 
{
public static void main(String[] args) throws InterruptedException, AWTException 
  {
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.amazon.in/?gad_source=1&gclid=EAIaIQobChMImaLczsjRigMVozaDAx2P6BNJEAAYASAAEgIUcfD_BwE");
	driver.manage().window().maximize();
	WebElement ele = driver.findElement(By.xpath("//img[@alt='City Outdoor Furniture Single Seater Iron Frame Swing Chair With Stand&Cushion&Hook Outdoor Indoor|Balcony Garden...\']"));
    Point loc = ele.getLocation();
    int x = loc.getX();
    int y = loc.getY();
    System.out.println(x);
    System.out.println(y);
	JavascriptExecutor js=(JavascriptExecutor)driver;
    
    js.executeScript("window.scrollBy("+x+","+y+")");
  }
}

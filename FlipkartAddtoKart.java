package testNGFramework;



import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FlipkartAddtoKart {
WebDriver driver;
@Test
public void a_pageload() 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
}
@Test
public void b_search()
{
	driver.findElement(By.xpath("//a[contains(text(),'Create')]//preceding::button[2]")).click();
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Shoes");
	Actions abc=new Actions(driver);
	abc.sendKeys(Keys.ENTER).build().perform();
}
@Test
public void c_openproduct() 
{
	String URL=driver.getCurrentUrl();
	System.out.println(URL);
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//a[text()='Casual Sneakers White Outdoor Shoes For Boys And Men Sn...']")).click();
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	String shoename=driver.findElement(By.xpath("//a[text()='Casual Sneakers White Outdoor Shoes For Boys And Men Sn...']")).getText();
	System.out.println(shoename);
	String title=driver.getTitle();
	System.out.println(title);
	ArrayList <String> flipkartTabs =new ArrayList <String> (driver.getWindowHandles());
	driver.switchTo().window(flipkartTabs.get(1));
	String secondndtab=driver.getTitle();
	System.out.println(secondndtab);
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	String size=driver.findElement(By.xpath("//a[text()='7']")).getText();
	System.out.println(size);
	driver.findElement(By.xpath("//a[text()='7']")).click();
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//span[contains(text(),'Frequently Bought Together')]/following::img[4]")).click();
	driver.findElement(By.xpath("//span[contains(text(),'Frequently Bought Together')]/following::img[7]")).click();
}
@Test
public void d_addtokart()
{
	String addtoKart=driver.findElement(By.xpath("//button[text()='Add to cart']")).getText();
	System.out.println(addtoKart);
	driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	driver.close();
	driver.quit();
}
	

	
	

}

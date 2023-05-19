package testNGFramework;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FlipkartMobile {
	WebDriver driver;
@Test
public void a_pageload()
{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'Enter Email/Mobile number')]/preceding::button[1]")).click();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		String URL1=driver.getCurrentUrl();
		System.out.println(URL1);
		String title1=driver.getTitle();
		System.out.println(title1);
}
@Test
public void b_phonesearch()
{
		driver.findElement(By.name("q")).sendKeys("iphone14pro");
		Actions act1=new Actions(driver);
		act1.sendKeys(Keys.ENTER).build().perform();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 Pro (Deep Purple, 128 GB)']")).click();
		ArrayList <String> Tabs=new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(Tabs.get(1));
		String URL2=driver.getCurrentUrl();
		System.out.println(URL2);
		String title2=driver.getTitle();
		System.out.println(title2);
		
		String Info=driver.findElement(By.xpath("//span[text()='APPLE iPhone 14 Pro (Deep Purple, 128 GB)']")).getText();
		System.out.println(Info);
		String price=driver.findElement(By.xpath("//span[contains(text(),'Extra ')]/following::div[1]")).getText();
		System.out.println(price);
}
@Test
public void c_addtokart()
{
		String addtocart=driver.findElement(By.xpath("//button[text()='Add to cart']")).getText();
		System.out.println(addtocart);
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[contains(text(),'Remove')]")).click();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[text()='Cancel']/following-sibling::div")).click();
		driver.navigate().back();
		driver.quit();
}
	
}

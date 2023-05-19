package testNGFramework;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class DemoBlaze {
	WebDriver driver;
	@Test
	public void a_pageload()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.demoblaze.com/");
	driver.manage().window().maximize();
	}
	@Test
	public void b_Login() 
	{
	driver.findElement(By.id("signin2")).click();
	driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
	driver.findElement(By.id("sign-username")).sendKeys("kabilan");
	driver.findElement(By.id("sign-password")).sendKeys("Kabilan@001");
	driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
	driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
	Alert alt=driver.switchTo().alert();
	String alertpopup=alt.getText();
	System.out.println(alertpopup);
	alt.accept();
	driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//h5[contains(text(),'Sign up')]/following::span[1]")).click();
	}
	@Test
	public void c_contact() 
	{
	driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
	driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
	driver.findElement(By.id("recipient-email")).sendKeys("kabilan@gmai.com");
	driver.findElement(By.id("recipient-name")).sendKeys("bharathi");
	driver.findElement(By.id("message-text")).sendKeys("En ley ipdi pandra chethapayale narapayale aruthu kilichipuduvan kilichi");
	driver.findElement(By.xpath("//button[text()='Send message']")).click();
	driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
	Alert abc1=driver.switchTo().alert();
	String text=abc1.getText();
	System.out.println(text);
	abc1.accept();
	}
	@Test
	public void d_productSearch() 
	{
	driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[contains(text(),'Iphone')]")).click();
	driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
	String title=driver.getTitle();
	System.out.println(title);
	String URL=driver.getCurrentUrl();
	System.out.println(URL);
	
	String name=driver.findElement(By.xpath("//h2[contains(text(),'Iphone')]")).getText();
	System.out.println(name);
	String price=driver.findElement(By.xpath("//h3[text()='$790']")).getText();
	System.out.println(price);
	
	String description=driver.findElement(By.xpath("//strong[contains(text(),'description')]")).getText();
	System.out.println(description);
	String paragraph=driver.findElement(By.xpath("//p[starts-with(text(),'It comes with')]")).getText();
	System.out.println(paragraph);
	
	driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
	driver.navigate().back();
	driver.quit();
	}

}

package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ZeroBankForgotpass {
	WebDriver driver;
	@Test
	public void a_pageload()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://zero.webappsecurity.com/");
	driver.manage().window().maximize();
	}
	@Test
	public void b_forgotpassword()
	{
	String cssvalue=driver.findElement(By.id("signin_button")).getCssValue("font-size");
	System.out.println(cssvalue);
	String title=driver.getTitle();
	System.out.println(title);
	driver.findElement(By.id("signin_button")).click();
	String url=driver.getCurrentUrl();
	System.out.println(url);
	String tagname=driver.findElement(By.xpath("//a[text()='Forgot your password ?']")).getTagName();
	System.out.println(tagname);
	driver.findElement(By.xpath("//a[text()='Forgot your password ?']")).click();
	driver.findElement(By.id("user_email")).sendKeys("kabilankovalam@gmail.com");
	String attribute=driver.findElement(By.name("submit")).getAttribute("value");
	System.out.println(attribute);
	driver.findElement(By.name("submit")).click();
	String result=driver.findElement(By.xpath("//h3[text()='Forgotten Password']")).getText();
	System.out.println(result);
	driver.close();
	}

}

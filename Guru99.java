package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Guru99 {

		WebDriver driver;
		@Test
		public void a_pageload()
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		}
		@Test
		public void b_signup()
		{
		driver.findElement(By.name("firstName")).sendKeys("kabilan");
		driver.findElement(By.name("lastName")).sendKeys("anbu");
		driver.findElement(By.name("phone")).sendKeys("8838312456");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("kabilananbu2000@gmail.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Pillayar kovil street");
		driver.findElement(By.name("city")).sendKeys("chennai");
		driver.findElement(By.name("state")).sendKeys("tamilnadu");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("603-112");
		Select country=new Select(driver.findElement(By.xpath("//select[@name='country']")));
		country.selectByVisibleText("INDIA");
		driver.findElement(By.id("email")).sendKeys("kabilan008");
		driver.findElement(By.name("password")).sendKeys("Kabilan@0109");
		driver.findElement(By.name("confirmPassword")).sendKeys("Kabilan@0109");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		driver.quit();
		}
		
		

	

}

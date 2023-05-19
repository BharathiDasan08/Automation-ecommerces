package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class formy {
	WebDriver driver;
	
	@Test
	public void a_pageload()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void b_registration()
	{
		driver.get("https://formy-project.herokuapp.com/form");
		driver.findElement(By.id("first-name")).sendKeys("kabilan");
		driver.findElement(By.id("last-name")).sendKeys("anbu");
		driver.findElement(By.id("job-title")).sendKeys("Automation-Engineer");
		//driver.findElement(By.id("radio-button-2")).click();
		WebElement Education =driver.findElement(By.id("radio-button-2"));
		Education.click();
		//driver.findElement(By.id("checkbox-3")).click();
		WebElement Gender =driver.findElement(By.id("checkbox-1"));
		Gender.click();
		Select experience = new Select(driver.findElement(By.id("select-menu")));
		experience.selectByVisibleText("0-1");
		driver.findElement(By.id("datepicker")).sendKeys("01/09/2000");
		driver.findElement(By.xpath("//a[contains(text(),'Submit')]")).click();
		driver.quit();
	}
		
		
	

}

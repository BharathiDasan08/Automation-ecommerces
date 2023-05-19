package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class JpetStore {
	WebDriver driver;
	@Test (priority=1)
	public void pagesLoad()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
	driver.manage().window().maximize();
	}
	@Test (priority=2)
	public void userInfo()
	{
	driver.findElement(By.name("username")).sendKeys("kabilan");
	driver.findElement(By.name("password")).sendKeys("Kabilan@0109");
	driver.findElement(By.name("repeatedPassword")).sendKeys("Kabilan@0109");
	}
	@Test (priority=3)
	public void accountInfo()
	{
	driver.findElement(By.name("account.firstName")).sendKeys("Pavenden");
	driver.findElement(By.name("account.lastName")).sendKeys("Bharathi");
	driver.findElement(By.name("account.email")).sendKeys("Kabilankovalam@gmail.com");
	driver.findElement(By.name("account.phone")).sendKeys("8838312456");
	driver.findElement(By.name("account.address1")).sendKeys("kovalam 603-112");
	driver.findElement(By.name("account.address2")).sendKeys("kovalam 603-112");
	driver.findElement(By.name("account.city")).sendKeys("chennai");
	driver.findElement(By.name("account.state")).sendKeys("TamilNadu");
	driver.findElement(By.name("account.zip")).sendKeys("603-112");
	driver.findElement(By.name("account.country")).sendKeys("India");
	}
	@Test (priority=4)
	public void profileInfo()
	{
	WebElement language= driver.findElement(By.name("account.languagePreference"));
	Select mylanguage = new Select(language);
	mylanguage.selectByValue("japanese");
	WebElement category = driver.findElement(By.name("account.favouriteCategoryId"));
	Select myCategory =new Select(category);
	myCategory.selectByValue("DOGS");
	WebElement list=driver.findElement(By.xpath("//input[@name='account.listOption']"));
	list.click();
	WebElement banner=driver.findElement(By.xpath("//input[@name='account.bannerOption']"));
	banner.click();
	driver.findElement(By.name("newAccount")).click();
	driver.quit();
	}
}


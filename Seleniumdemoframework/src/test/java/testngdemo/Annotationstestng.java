package testngdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotationstestng {
	
	
	WebDriver driver;
	public String title;
	public String URL;

	@BeforeTest
	public void BT() throws InterruptedException
	{
	   WebDriverManager.chromedriver().setup();
		
		driver =new ChromeDriver();
		driver.get("https://www.google.com");
		
		
	}
	@Test(priority=0)
	public void login() {
		
	
	Assert.assertEquals("alok", "alok1");
		
		}
	@Test(priority=1)
	public void apple() {
		
		title=driver.getTitle();
	
				}
	@Test(priority=2)
	public void cat() {
		URL=driver.getCurrentUrl();
	
		
		}
	@Test(priority=3,dependsOnMethods="login",alwaysRun=true)
	public void bat() {
		
		System.out.println(title+URL);
		
		}
	
	@AfterTest()
	public void AT() {
		
	driver.close();
		
		}
}

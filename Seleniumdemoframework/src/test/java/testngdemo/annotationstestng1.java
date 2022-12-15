package testngdemo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class annotationstestng1 {
	WebDriver driver;
	public String title;
	public String URL;
	@BeforeTest
	public void bt() throws InterruptedException
	{
		   WebDriverManager.chromedriver().setup();
			
			driver =new ChromeDriver();
			driver.get("www.google.com");
			driver.manage().window().maximize();
		    String beforelogin =driver.getTitle();
			Thread.sleep(5000);
			
			
		}
		@Test()
		public void test1() {
			
		title=driver.getTitle();
			
			}
		@Test()
		public void test2() {
			
		URL=driver.getCurrentUrl();
			
			}
		@Test()
		public void test3() {
			
		System.out.println(title+URL);
			
			}
		@AfterTest()
		public void AT() {
			
		driver.close();
			
			}
	}



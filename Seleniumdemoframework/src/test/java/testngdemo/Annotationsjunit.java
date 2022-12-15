package testngdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotationsjunit {

	
	WebDriver driver;
	public String title;
	public String URL;

	@Before
	public void BT() throws InterruptedException
	{
	   WebDriverManager.chromedriver().setup();
		
		driver =new ChromeDriver();
		driver.get("www.google.com");
		driver.manage().window().maximize();
	    String beforelogin =driver.getTitle();
		Thread.sleep(5000);
		
		
	}
	@Test
	public void test1() {
		
	title=driver.getTitle();
	System.out.println(title);
		
		}
	@Test
	public void test2() {
		
	URL=driver.getCurrentUrl();
		
		}
//	@Test
//	public void test3() {
//		
//	System.out.println(title+URL);
//		
//		}
	@After
	public void AT() {
		
	driver.close();
		
		}
}

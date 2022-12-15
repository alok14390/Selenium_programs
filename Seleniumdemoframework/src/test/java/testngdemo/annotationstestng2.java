package testngdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class annotationstestng2 {
	
	WebDriver driver;
	public String URL;
	public String title;
	
	
	@BeforeTest
	public void bt(){
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("www.google.com");
		
	}
	
	@Test
	public void test()
	{
		
		title=driver.getTitle();
		
	}
	@Test
	public void test1()
	{
		
		URL=driver.getCurrentUrl();
		
	}
	@Test
	public void test2()
	{
		
		System.out.println(title+URL);
		
	}

	 @AfterTest
	 public void AT()
	 {
		 driver.close();
	 }
}

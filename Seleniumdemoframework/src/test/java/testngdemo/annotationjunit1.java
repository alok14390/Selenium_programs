package testngdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class annotationjunit1 {
	
	
	WebDriver driver;
	public String url;
	public String title;
	
	
	@Before
	public void bt()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("www.google.com");
		
		
	}
	
	
	@Test
	public void test1(){
		
		title=driver.getTitle();
	}
	
	@Test
	public void test2()
	{
		url=driver.getCurrentUrl();
		
	}
	
	@Test
	public void test3()
	{
		
		System.out.println(title+url);
		
		
	}
	
	@After
	public void at()
	{
		driver.close();
	}
	

}


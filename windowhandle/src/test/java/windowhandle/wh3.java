package windowhandle;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class wh3 {
	
	public  static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public  static String url1="https://www.google.com";
	public  static String url2="https://www.youtube.com";
	
	WebDriver driver;
	
	
	@BeforeTest
	public void bt(){
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get(url);
		
		
		
	}
	
	
	@Test
	public void test1() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}
	
	
	@Test
	public void test2() {
		
		driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get(url1);
		
		driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get(url2);
		
		
		
		
	}
	
	
	@AfterTest
	public void at()
	
	{
		
		
////		 ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
//		  int s=tabs.size();
//		  System.out.println(s); 
//		  //select the tab
//		  driver.switchTo().window(tabs.get(0)); 
  driver.close();
//		
	}
	
	
	
	

}

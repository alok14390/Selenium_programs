package testngdemo;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest
{
	public static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	WebDriver driver;
	
  @Test(dataProvider = "alok")
  public void f(String n, String s) throws InterruptedException {
	  Thread.sleep(2000);
	  driver.findElement(By.name("username")).sendKeys(n);
		driver.findElement(By.name("password")).sendKeys(s);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		
				
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@href='/web/index.php/auth/logout']")).click();
	  
	  
  }

  @DataProvider
  public Object[][] alok() {
    return new Object[][] {
      new Object[] { "Admin", "admin123" },
      new Object[] { "Admin", "admin123" },
    };
  }
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver =new ChromeDriver();
	  driver.get(url);
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}

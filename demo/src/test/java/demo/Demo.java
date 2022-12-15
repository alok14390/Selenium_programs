package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	public static  String url =	"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	@Test
	public  void testcase1() throws InterruptedException{
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver =new ChromeDriver();
	driver.get(url);
    String beforelogin =driver.getTitle();
	Thread.sleep(5000);
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	String afterlogin =driver.getTitle();
	Thread.sleep(3000);
	if(beforelogin.equals(afterlogin))
	{
	driver.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@href='/web/index.php/auth/logout']")).click();
	}
	
	else
	{
		System.out.println("title page is not same");
	}
	
	driver.close();
}

}



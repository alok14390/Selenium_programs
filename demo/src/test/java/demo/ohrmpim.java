package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ohrmpim {
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
	driver.findElement(By.xpath("//*[@class='oxd-form-row']/div/div[2]/div/div[2]/input")).sendKeys("0038");
}
}

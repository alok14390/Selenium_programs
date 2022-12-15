package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class acmouse {
	public static  String url =	"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriver driver;

	@Test
	public void actionsmouse() throws InterruptedException
	{
	   WebDriverManager.chromedriver().setup();
		
		driver =new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		String beforelogin =driver.getTitle();
		Thread.sleep(5000);
	 	driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}
	
	@Test
	public void mousehover() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']")).sendKeys("alok");
		
		//driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']/following::input[2]")).sendKeys("alok");
		 Thread.sleep(3000);
	}

}



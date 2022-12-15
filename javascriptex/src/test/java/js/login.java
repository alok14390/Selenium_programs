package js;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login extends js1 {
	public String url="https://demoapp.skillrary.com/login.php?type=login";
	WebDriver driver;
	@BeforeTest
	public void beforetest() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		driver=new ChromeDriver(options);
		driver.get(url);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
	}
	@Test
	public void test1() throws InterruptedException
	{
		
		
		WebElement email=driver.findElement(By.name("email"));
		js1.scrollIntoView(email, driver);
		
		js1.passingValuesUsingJS(email, "admin", driver);
		
		WebElement pass= driver.findElement(By.name("password"));
		js1.passingValuesUsingJS(pass, "admin", driver);
		Thread.sleep(3000);
		WebElement login=driver.findElement(By.xpath("//*[@id='last']"));
		
		js1.clickElementByJS(login, driver);
		Thread.sleep(3000);
	}

}

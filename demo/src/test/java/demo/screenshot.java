package demo;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class screenshot {
	
	  WebDriver driver;
	 @BeforeTest
	 public void beforetest() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			
			Thread.sleep(5000);
	 }
			@Test
			public void Testcase2() throws InterruptedException, IOException {
				
			//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				driver.findElement(By.name("username")).sendKeys("Admin");
				driver.findElement(By.name("password")).sendKeys("admin123");
				driver.findElement(By.xpath("//*[@type='submit']")).click();
				Thread.sleep(2000);	
				File alok=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//capture a screenshot and store in a location.
				FileUtils.copyFile(alok, new File("C://Users//S R SRINATH//Desktop//seleniumscreenshot//Homepage.png"));//
}
			
			@Test
			public void Testcase3() throws InterruptedException {
				driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				driver.findElements(By.xpath("//*[@class='oxd-table-card']")).get(11).click();
				driver.findElements(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).get(11).click();
				driver.findElements(By.xpath("//*[@class='oxd-icon bi-trash']")).get(11).click();
				driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
								
				
			}
			@AfterTest
			public void AT() throws InterruptedException {
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
				driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
				//driver.close();
			}
}
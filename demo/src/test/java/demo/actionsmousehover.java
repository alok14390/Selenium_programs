package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actionsmousehover {
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
	//click on Admin
	 driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();
	 Thread.sleep(3000);
	 Actions act= new Actions(driver);
	 //mouse hover to add button
	 act.moveToElement(driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary']")));
	 // mouse hover to user role
	 act.moveToElement(driver.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")));
	 //click on user role
	 WebElement ele= driver.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']"));
	 act.click(ele).build().perform();
	 //Selecting ESS from dropdown
	 act.sendKeys(ele,Keys.ARROW_DOWN).click().build().perform();
	 act.sendKeys(ele,Keys.ARROW_DOWN).click().build().perform();
	 act.sendKeys(ele,Keys.ENTER).click().build().perform();
	 //act.sendKeys(ele,Keys.ENTER).click().build().perform();
	 Thread.sleep(3000);
	 // click on employee name
	 
	 driver.findElement(By.xpath("//*[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']")).click();
	 //mouse hover to status
	  act.moveToElement(driver.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")));
      Thread.sleep(3000);
	 //click on status
	 WebElement ele1=driver.findElements(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")).get(1);
	 act.click(ele1).build().perform();
	 //selecting the Disabled
	 act.sendKeys(ele1,Keys.ARROW_DOWN).click().build().perform();
	 act.sendKeys(ele1,Keys.ARROW_DOWN).click().build().perform();
	 act.sendKeys(ele,Keys.ENTER).click().build().perform();
	 // click on search
	WebElement ele2= driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));
	Actions act1= new Actions(driver);
	act1.click(ele2).build().perform();
	Thread.sleep(3000);	 
	  
	
}
}
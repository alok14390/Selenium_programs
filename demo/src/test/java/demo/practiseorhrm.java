package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practiseorhrm {
	
	public static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriver driver;
	
	
	@BeforeTest
	public void test1() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get(url);
	}
	
	
	
	@Test
	public void test2() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}
	
	@Test
	public void test3() throws InterruptedException
	{

		driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[7]/a")).click();
		driver.findElement(By.xpath("//*[@placeholder='Type for hints...']")).sendKeys("alok");
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")));
		WebElement ele1= driver.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']"));
		act.click(ele1).build().perform();
		 act.sendKeys(ele1,Keys.ARROW_DOWN).click().build().perform();
		
		act.moveToElement(driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")));
		WebElement ele= driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));
		Thread.sleep(3000);
		act.click(ele).build().perform();
		driver.findElement(By.xpath("//*[@class=class='oxd-icon bi-calendar oxd-date-input-icon']")).click();
		driver.findElement(By.name("January")).click();
		
		
		
		
		
		
	}
	

}

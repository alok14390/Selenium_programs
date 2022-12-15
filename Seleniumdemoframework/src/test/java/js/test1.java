package js;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 extends js1{
	
	WebDriver driver;
	public static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	@BeforeTest
	public void bt(){
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		
	}
	
	
	@Test
	public void test() throws InterruptedException {
		Thread.sleep(3000);
		
	WebElement ele=	driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
	js1.drawBorder(ele, driver);
	  js1.flash(ele, driver);
	  js1.changeColor("red", ele, driver);
	
		
	}
	
	

}

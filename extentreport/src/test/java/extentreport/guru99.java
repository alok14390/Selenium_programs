package extentreport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class guru99 {

	public static  String url="https://demo.guru99.com/test/newtours/";
	WebDriver driver;
	ExtentHtmlReporter htmlReporter ;
	ExtentReports extent ;
	ExtentTest test ;

@BeforeTest	
public void BT() throws InterruptedException{
	
	
	htmlReporter = new ExtentHtmlReporter("extent.html");	
	extent = new ExtentReports();
	extent.attachReporter(htmlReporter);
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	//driver.findElement(By.className("caret")).click();
	//driver.findElement(By.linkText("Ajax Demo")).click();
	String beforelogin =driver.getTitle();
	Thread.sleep(5000);
	
	
}

@Test
public void test1() throws InterruptedException{
	
	test = extent.createTest("MyFirstTest");
	
	driver.findElement(By.name("userName")).sendKeys("user");
	
	test.pass("User have entered the username");
	
	driver.findElement(By.name("password")).sendKeys("user");
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	
	test.info("User may see the admin page");
	
	driver.findElement(By.xpath("//*[@href='register.php']")).click();
	driver.navigate().back();
	Thread.sleep(5000);
	driver.navigate().refresh();
	Thread.sleep(5000);
	driver.navigate().forward();
}
	
	@Test(invocationCount = 2,invocationTimeOut = 60000)
	public void test12() throws InterruptedException {
	driver.findElement(By.name("firstName")).sendKeys("alok");
	driver.findElement(By.name("lastName")).sendKeys("kumar");
	driver.findElement(By.name("phone")).sendKeys("8105578258");
	driver.findElement(By.name("userName")).sendKeys("alokkumar@gmail.com");
	driver.findElement(By.name("address1")).sendKeys("kalyani123/a");
	driver.findElement(By.name("city")).sendKeys("kolkata");
	driver.findElement(By.name("state")).sendKeys("Westbengal");
	driver.findElement(By.name("postalCode")).sendKeys("678900");
	Select s= new Select(driver.findElement(By.name("country")));
	//s.selectByValue("ALGERIA");
	//s.selectByIndex(0);
	s.selectByVisibleText("ANDORRA");
	Thread.sleep(5000);
	driver.findElement(By.name("email")).sendKeys("alokkumar");
	driver.findElement(By.name("password")).sendKeys("alokkumar06bt");
	driver.findElement(By.name("confirmPassword")).sendKeys("alokkumar06bt");
	driver.findElement(By.name("submit")).click();
	String register =driver.getTitle();
	System.out.println(register);
	//SoftAssert softAssert=new SoftAssert();
    //softAssert.assertEquals(register, "Register: Mercury Tousssss");
	String curl=driver.getCurrentUrl();
	Thread.sleep(5000);
	
	System.out.println(url);
	
	System.out.println(curl);
	//softAssert.assertAll();
	
	
}
	
	@AfterTest
	public void AT()
	{
		//driver.close();
		extent.flush();
	}
		
}
    

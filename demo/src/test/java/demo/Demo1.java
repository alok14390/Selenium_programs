package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 
{

public static  String url =	"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
WebDriver driver;

@BeforeTest
public void BT() throws InterruptedException
{
   WebDriverManager.chromedriver().setup();
	
	driver =new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
    String beforelogin =driver.getTitle();
	Thread.sleep(5000);
	
	
}
@Test(enabled=true)
public void test23() throws InterruptedException {
	
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	
	}

	
	@Test(enabled=true)
	public  void testcase1() throws InterruptedException{
	
    
	
	Thread.sleep(3000);
	
	//click on admin
	driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();
	Thread.sleep(3000);
	List<WebElement> click=driver.findElements(By.xpath("//*[@class='oxd-table-card']"));
    System.out.println("listsize " + click.size());
    Thread.sleep(5000);
     driver.findElements(By.xpath("//*[@class='oxd-table-card']")).get(3).click();
     Thread.sleep(5000);
     System.out.println(driver.findElements(By.xpath("//*[@class='oxd-table-card']")).get(3).getText());
     Thread.sleep(5000);
	 driver.findElements(By.xpath("//*[@class='oxd-icon bi-trash']")).get(3).click();
   	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
		
	}
	
	
	@Test(enabled=false)
	public  void actions() throws InterruptedException
	{	
		Thread.sleep(3000);
		//click on admin
		 driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();
		 //click on user role
		 
		 WebElement ele = driver.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']"));
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.click().build().perform();
		Thread.sleep(3000);
		act.sendKeys(ele,Keys.ARROW_DOWN).click().build().perform();
		act.sendKeys(ele,Keys.ARROW_DOWN).click().build().perform(); 
		act.sendKeys(ele,Keys.ARROW_DOWN).click().build().perform();
		Thread.sleep(3000);
		act.sendKeys(ele,Keys.ENTER).click().build().perform();
		Thread.sleep(3000);

		
	}
	
	@Test(enabled=false)
	public  void actionskeyboard() throws InterruptedException
	{	
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']"));
		//Actions act = new Actions(driver);
		act.click(ele).build().perform();
		act.sendKeys(ele,Keys.ARROW_DOWN).click().build().perform();
		act.sendKeys(ele,Keys.ARROW_DOWN).click().build().perform();
		act.sendKeys(ele,Keys.ARROW_DOWN).click().build().perform();
		Thread.sleep(3000);
		act.sendKeys(ele,Keys.ENTER).click().build().perform();
		Thread.sleep(3000);

		
	}
	
	@Test(enabled=false)
	public void actionsmousehover() throws InterruptedException
	{
		
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
			act1.moveToElement(ele2).click().build().perform();
			Thread.sleep(3000);

		
}
		 
		 
		 
	@Test(enabled=false)
	public  void actionsmouse() throws InterruptedException
	{	
		Actions act = new Actions(driver);
		 driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']/following::input[2]")).sendKeys("alok");
		 Thread.sleep(3000);
		//act.moveToElement( Employeeid).sendKeys("alok123").build().perform();
		//act.sendKeys(Employeename,alok).build().perform();
	
	}
	
	
	@Test(enabled=false)
	public  void testcase2() throws InterruptedException
	{
	driver.findElement(By.xpath("//*[@href='/web/index.php/maintenance/viewMaintenanceModule']")).click();
	driver.findElement(By.name("password")).sendKeys("admin123");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--large oxd-button--secondary orangehrm-admin-access-button']")).click();
	driver.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
    Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@role='menuitem']")).click();
	}
	
	@AfterTest
	public void AT() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@href='/web/index.php/auth/logout']")).click();

	driver.quit();
}
	}






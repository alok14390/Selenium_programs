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

public class practise1 {
	
	public static  String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriver driver;
	
	@BeforeTest
	public void BT() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		String beforetitle= driver.getTitle();
		System.out.println(beforetitle);
		Thread.sleep(3000);
		
	}
	
	@Test(enabled=true,priority=0)
     public void test()
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		
		
	}
	
	@Test(enabled=true,priority=0)
    public void test1() {
		
		driver.findElement(By.xpath("//*[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']/input")).sendKeys("alok1");
		driver.findElement(By.xpath("//*[@class='oxd-form-row']/div/div[2]/div/div[2]/input")).sendKeys("0038");
		Actions act= new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']"));
		act.click(ele).build().perform();
		act.sendKeys(ele,Keys.ARROW_DOWN).click().build().perform();
		act.sendKeys(ele,Keys.ENTER).click().build().perform();
		WebElement ele1=driver.findElements(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")).get(0);
		act.click(ele1).build().perform();
		act.sendKeys(ele1,Keys.ARROW_DOWN).click().build().perform();
		act.sendKeys(ele1,Keys.ENTER).click().build().perform();
		driver.findElements(By.xpath("//*[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']/input")).get(1).sendKeys("gdhjasjd");
		
		WebElement ele2=driver.findElement(By.xpath("//*[@class='oxd-grid-item oxd-grid-item--gutters'][6]//div[2]//div[2]/i"));
		act.click(ele2).build().perform();
		act.sendKeys(ele2,Keys.ARROW_DOWN).click().build().perform();
		act.sendKeys(ele2,Keys.ENTER).click().build().perform();
		WebElement ele3=driver.findElements(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")).get(2);
		act.click(ele3).build().perform();
		act.sendKeys(ele3,Keys.ARROW_DOWN).click().build().perform();
		act.sendKeys(ele3,Keys.ENTER).click().build().perform();
		
		//driver.findElements(By.xpath("//*[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']/input")).get(1).sendKeys("gdhjasjd");
		
		

	}
	
	
	

}

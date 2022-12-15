package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alert {
	public static  String url =	"https://demoqa.com/alerts/";
	WebDriver driver ;
	
	@BeforeTest
	public void alert1() throws InterruptedException{
		  WebDriverManager.chromedriver().setup();
		  driver =new ChromeDriver();
		  driver.get(url);
		  driver.manage().window().maximize();
		  
	}
	@Test
	public void alert2() throws InterruptedException {
		  driver.findElement(By.xpath("//*[@id='alertButton']")).click();
		  System.out.println(driver.switchTo().alert().getText());
		  Thread.sleep(3000);
		  Alert alok= driver.switchTo().alert();
		  alok.accept();
		  Thread.sleep(3000);
		  System.out.println("alok1");
	}
	@Test
	public void alert3() throws InterruptedException {	
		 driver.findElement(By.xpath("//*[@id='timerAlertButton']")).click();
		 Thread.sleep(5000);
		 System.out.println(driver.switchTo().alert().getText());
	     Alert alok1= driver.switchTo().alert();
	     alok1.accept();
	     Thread.sleep(3000);
		 System.out.println("alok2");
	     Thread.sleep(3000);
	}
	
	@Test
	public void alert4() throws InterruptedException {
		    driver.findElement(By.xpath("//*[@id='confirmButton']")).click();
		    System.out.println(driver.switchTo().alert().getText());
		    Thread.sleep(3000);
		    Alert alok3=driver.switchTo().alert();
		    alok3.accept();
		    
		    Thread.sleep(3000);
		    System.out.println("ksjhskjdhs");
		    Thread.sleep(3000);
		
			 driver.findElement(By.xpath("//*[@id='promtButton']")).click();
			 System.out.println(driver.switchTo().alert().getText());
			 Alert alok2= driver.switchTo().alert();
			 Thread.sleep(3000);
			 driver.switchTo().alert().sendKeys("alok");
		     alok2.accept();
		     Thread.sleep(3000);
			
			
	}	
			
			
		 
	}
		

	
	


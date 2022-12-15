 package frames;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frames1 {
	
	
public static String url= "https://the-internet.herokuapp.com/nested_frames";
	
	WebDriver driver;
	@BeforeTest
	public void bt()
	{
		WebDriverManager.firefoxdriver().setup();
		//FirefoxOptions options= new FirefoxOptions();
		//options.setHeadless(true);
		driver= new FirefoxDriver();
		driver.get(url);
	}
	
	
	@Test
	public void test() throws InterruptedException, FileNotFoundException
	{
		driver.findElements(By.tagName("frameset")).size();
		System.out.println(driver.findElements(By.tagName("frameset")).size());
		
		driver.findElements(By.tagName("frame")).size();
		System.out.println(driver.findElements(By.tagName("frame")).size());
		
		driver.switchTo().frame(driver.findElement(By.name("frame-top")));
		Thread.sleep(3000);
		System.out.println("driver in frame top");
		Thread.sleep(3000);
	//	driver.switchTo().frame(1);
		driver.switchTo().frame(driver.findElement(By.name("frame-middle")));
		System.out.println("driver in middle frame");
		WebElement text=driver.findElement(By.xpath("//*[@id=\"content\"]"));
		System.out.println(text.getText());
		
		
		PrintStream ps= new PrintStream(new File("C:\\Users\\Aloke\\Desktop\\console.txt"));
		System.setOut(ps);
		ps.print(driver.findElement(By.xpath("//*[@id=\"content\"]")));
		
		

}
}

package windowhandle;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class wh2 {
	
	
	
	public static  String url =	"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public static  String url1 =	"https://youtube.com";	
	public static  String url2 =	"https://www.google.com";	
	@Test
	public  void testcase1() throws InterruptedException{
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver =new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
    String beforelogin =driver.getTitle();
	Thread.sleep(5000);
	//driver.manage().window().maximize();
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	String afterlogin =driver.getTitle();
	Thread.sleep(3000);
	 //*String parenthandle=driver.getWindowHandle();
	// System.out.println("parentwindow "+parenthandle);
	 //Set<String> handles=driver.getWindowHandles();
	 //for(String handle:handles) {
		// System.out.println(handle);
		 //if(!handle.equals(parenthandle)) {
			// driver.switchTo().window(handle);
		 //}
	 Set<String> Parenttab= driver.getWindowHandles();
	//opening the tab
	driver.switchTo().newWindow(WindowType.TAB);
	driver.navigate().to(url1);
	//driver.switchTo().newWindow(WindowType.TAB);
	//driver.navigate().to(url2);
	 Set<String> childtab= driver.getWindowHandles();
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.navigate().to(url2);
	
	  ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	  int s=tabs.size();
	  System.out.println(s); 
	  //select the tab
	  driver.switchTo().window(tabs.get(2)); 
	  driver.close();
	  driver.switchTo().window(tabs.get(1)); 
	  driver.close();
	 
	
	
	
}
	
	}




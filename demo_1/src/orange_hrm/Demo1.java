package orange_hrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
public static  String url =	"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C://Users//Aloke//Downloads//chromedriver_win32//chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get(url);
    String beforelogin =driver.getTitle();
	Thread.sleep(5000);
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	String afterlogin =driver.getTitle();
	Thread.sleep(3000);
	if(beforelogin.equals(afterlogin))
	{
	driver.findElement(By.linkText("Employee List")).click();
	driver.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
	//driver.findElement(BylinkText("Employee List")).click();
			
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@href='/web/index.php/auth/logout']")).click();
	}
	
	else
	{
		System.out.println("title page is not same");
	}
	
	driver.close();
}


}
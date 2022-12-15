package parallel_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pt {
	
	WebDriver driver;
	public static  String url =	"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	//WebDriver driver;
	@Parameters("mybrowser")
	
	@BeforeTest()
	public  void testcase1(String mybrowser) {
		if(mybrowser.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();
		
		 driver =new ChromeDriver();
	}
	else if(mybrowser.equalsIgnoreCase("firefox"))
		
	{
		WebDriverManager.firefoxdriver().setup();
		
		
	 driver =new FirefoxDriver();
	
	
		
}
		
		
		
}
	
	
	@Test()
	public void test()
	{
		
		
	}
	
}


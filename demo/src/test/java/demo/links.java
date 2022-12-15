package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sun.java.swing.plaf.windows.resources.windows;

import io.github.bonigarcia.wdm.WebDriverManager;

public class links {
	public static  String url =	"https://demo.guru99.com/test/newtours/";
	

	
	
		@Test
		public  void testcase1() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	    
		String afterlogin =driver.getTitle();
		Thread.sleep(3000);
//	List<WebElement> links= driver.findElements(By.xpath("//*[@class='mouseOut']"));
		List<WebElement> links= driver.findElements(By.tagName("a"));
	System.out.print("total no links "+links.size());
	for(int i=0;i<links.size();i++)
	{
	
  System.out.println(links.get(i).getText());
   System.out.println(links.get(i).getAttribute("href"));

	}
	
}
}

	
	

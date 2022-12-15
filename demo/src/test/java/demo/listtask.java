package demo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class listtask {
	public static  String url="https://demo.guru99.com/test/newtours/";
	WebDriver driver;
	public void task() throws InterruptedException, IOException{
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		String beforelogin =driver.getTitle();
		Thread.sleep(5000);
		//capturing links from the webpage
		List<WebElement> links= driver.findElements(By.tagName("a"));
	
		
		//number of links
		System.out.println(links.size());
		
		
		for(int i=0;i<links.size();i++)
			
			
			
		{
		String strLinkText=links.get(i).getAttribute("href");
		String strLinkText1="https://demo.guru99.com/test/newtours/support.php";
		
		if(strLinkText.equals(strLinkText1))
		{
			System.out.println("the link under construction "+links.get(i).getText());
		}
	
}
}
}

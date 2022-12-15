package orange_hrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo_2{
public static  String url =	"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
public static void main(String[] args) {
	
	System.setProperty("webdriver.gecko.driver","C://Users//Aloke//Downloads//geckodriver-v0.31.0-win32//geckodriver.exe");
	WebDriver driver =new FirefoxDriver();
	driver.get(url);
}

}





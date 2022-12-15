package definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class definition {
	public static String url="https://demoapp.skillrary.com/login.php?type=login";
    WebDriver driver;
	
	@Given("i should open the browser and naviagte to the login page of skillrary")
	public void i_should_open_the_browser_and_naviagte_to_the_login_page_of_skillrary() {
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.get(url);
       driver.manage().window().maximize();
      
		
	    
	}
	@When("Enter Username {string}")
	public void enter_username(String string) {
		 driver.findElement(By.name("email")).sendKeys(string);
	  
	}
	@And("Enter Password {string}")
	public void enter_password(String string) {
		 driver.findElement(By.name("password")).sendKeys(string);
	    
	}
	@And("Click on the loginbutton")
	public void click_on_the_loginbutton() {
		driver.findElement(By.xpath("//*[@id='last']")).click();
	    
	}
	@Then("i should see the username as {string}")
	public void i_should_see_the_username_as(String string) {
		String k= driver.getTitle();
	    
	}

    }
	
	


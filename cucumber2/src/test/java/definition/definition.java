package definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class definition {
	
	
	String url =	"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriver driver;
	@Given("i should be login page")
	public void i_should_be_login_page() {
		
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get(url);
	   
	}
	@When("Enter the username {string}")
	public void enter_the_username(String string) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys(string);
	}
	@And("Enter the password {string}")
	public void enter_the_password(String string) {
		driver.findElement(By.name("password")).sendKeys(string);
	    
	}
	@And("Click on the login button")
	public void click_on_the_login_button() {
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}
	@Then("I should see the title as {string}")
	public void i_should_see_the_title_as(String string) {
	   
	}

}

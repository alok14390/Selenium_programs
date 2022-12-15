package definition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class test_defintion {
    String url =	"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriver driver;
	
	
	
	@Given("I should go to the login page  ")
	public void i_should_go_to_the_login_page_preconditions() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get(url);
	    // Write code here that turns the phrase above into concrete actions
	  
	}
	@And("Enter the username {string}")
	public void enter_the_username(String string) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@And("Enter the password {string}")
	public void enter_the_password(String string) {
		driver.findElement(By.name("password")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	@And("Click on the login button")
	public void click_on_the_login_button() {
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@Then("I should see the username as {string}  ")
	public void i_should_see_the_username_as_outcomes(String string) {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.getTitle();
		 Assert.assertEquals(string,driver.getTitle());
		
		
	   
	}

	
	

}
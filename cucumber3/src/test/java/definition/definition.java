package definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class definition extends util {
	  String url =	"https://demoapp.skillrary.com/login.php?type=login";
		WebDriver driver;
	@Given("i should be login page")
	public void i_should_be_login_page() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get(url);
		 
	}
	    
	@When("Enter the username {string}")
	public void enter_the_username(String string) throws InterruptedException {
		 Thread.sleep(3000);
		WebElement email=driver.findElement(By.name("email"));
		

		util.passingValuesUsingJS(email,"admin", driver);
	}
	@And("Enter the password {string}")
	public void enter_the_password(String string) throws InterruptedException {
		WebElement pass= driver.findElement(By.name("password"));
		util.passingValuesUsingJS(pass, "admin", driver);
		Thread.sleep(3000);
	}
	@And("Click on the login button")
	public void click_on_the_login_button() {
		WebElement login=driver.findElement(By.xpath("//*[@id='last']"));
		util.clickElementByJS(login, driver);
	   
	}
	@Then("I should see the title as {string}")
	public void i_should_see_the_title_as(String string) {
	   
	}
}



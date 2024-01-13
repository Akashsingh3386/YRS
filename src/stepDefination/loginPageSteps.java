package stepDefination;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class loginPageSteps {
	
	WebDriver driver;

	@Given("user launch site")
	public void user_launch_site() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\singh\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	

	@When("enter username {string} and password {string}")
	public void enter_username_and_password(String uname, String password) {
	WebElement username =driver.findElement(By.id("user-name"));
	username.sendKeys(uname);
	
	WebElement pass =driver.findElement(By.id("password"));
	pass.sendKeys(password);
	
	}

	@When("click on login button")
	public void click_on_login_button() {
		WebElement btn =driver.findElement(By.id("login-button"));
		btn.click();


	}

	@Then("Validate error message")
	public void validate_error_message() {
		WebElement logo =driver.findElement(By.cssSelector("span.title"));
		assertTrue(logo.isDisplayed());
		
	}


		
}

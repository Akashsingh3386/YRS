package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class sellintroduction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\singh\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice//");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("inputUsername")).sendKeys("Akash");
		driver.findElement(By.name("inputPassword")).sendKeys("Singh");
		driver.findElement(By.className("signInBtn")).click();
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Akash");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Singh");
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("999999999");
		Thread.sleep(2000);
		driver.findElement(By.className("reset-pwd-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("go-to-login-btn")).click();
		Thread.sleep(4000);	
		driver.findElement(By.id("inputUsername")).sendKeys("Akash");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
		
	}

}

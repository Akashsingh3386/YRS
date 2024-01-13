package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:/Users/singh/Downloads/chromedriver-win64 (1)/chromedriver-win64/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://info:grapefruit@dev-pixiu-ingenuity.playzido.com/env/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElement(By.className("btn-primary")).click();
		

	}

}

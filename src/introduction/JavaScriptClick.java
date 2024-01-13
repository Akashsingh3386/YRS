package introduction;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:/Users/singh/Downloads/chromedriver-win64 (1)/chromedriver-win64/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement>checkbc = driver.findElements(By.className("bcCheckBox"));

//		JavascriptExecutor js =(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click()",checkbc);
//		
		
		for(WebElement e:checkbc) {
			
			e.click();
		}
		

	}

}

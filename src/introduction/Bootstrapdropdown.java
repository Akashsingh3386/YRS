package introduction;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrapdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:/Users/singh/Downloads/chromedriver-win64 (1)/chromedriver-win64/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("menu1")).click(); 
		List<WebElement> list = driver.findElements(By.xpath("//ul[@Class= 'dropdown-menu']/li/a"));
		
		for (WebElement s:list) {
			String value = s.getText();
					System.out.println(value);
					
					if(value.equals("JavaScript")) {
						
						s.click();
						break;
					}
			
			
			
		}

	}

}

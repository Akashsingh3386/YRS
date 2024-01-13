package TestNg1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Class2 {
	
	
	@Test(priority=1)
	void openApp()
	{
		System.out.println("testing 1");	
		
	}
	
	
	@Test(priority=3)
	void login()
	{
		
		System.out.println("testing 2");

	}
	
	@Test(priority=2)
	void close()
	{
		System.out.println("testing 3");

		
	}
	
	

}

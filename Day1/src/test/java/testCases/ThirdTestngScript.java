package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ThirdTestngScript {

	

	public static  WebDriver driver;

	@Test
	public void Login() {		
		driver.findElement(By.id("email")).sendKeys("Vandana");
		driver.findElement(By.id("pass")).sendKeys("singh");
		
	}
	
	@BeforeMethod
	public void LaunchFb() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ahishek Singh\\Downloads\\chromedriver.exe");
		driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com");
	}
	
   @AfterMethod
	public void CloseFb() {
		driver.close();
	}
}

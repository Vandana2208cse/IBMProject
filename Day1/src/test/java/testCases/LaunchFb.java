package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ahishek Singh\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("Vandana");
		driver.findElement(By.id("pass")).sendKeys("singh");
		driver.findElement(By.name("login")).click();

	}

}

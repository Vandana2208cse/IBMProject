package testCases;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumScript {
	
	public static void main(String[] args) {
		
		//To launch chrome browser
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ahishek Singh\\Downloads\\chromedriver.exe");
		//WebDriver driver =new ChromeDriver();
		
		
		//To launch edge browser 
		//download driver from selenium.dev (google it)
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Ahishek Singh\\Downloads\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		
		//WebDriver is an interface
		//ChromeDriver is a class
		
		driver.get("https://www.chrome.com");
	}
	

}

package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchCalorieCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ahishek Singh\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.calculator.net/calorie-calculator.html");
	
		
		driver.findElement(By.id("cage")).clear();
		driver.findElement(By.id("cheightfeet")).clear();
		driver.findElement(By.id("cheightinch")).clear();
		driver.findElement(By.id("cpound")).clear();
		
		
		driver.findElement(By.id("cage")).sendKeys("56");
		driver.findElement(By.id("cheightfeet")).sendKeys("6");
		driver.findElement(By.id("cheightinch")).sendKeys("12");
		driver.findElement(By.id("cpound")).sendKeys("190");
		
	

	}

}

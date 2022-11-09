package stepDefination;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
//import java.io.*;
//import java.lang.Thread;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import java.util.concurrent.TimeUnit;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDerfinationClass {
	
	WebDriver driver;
	
	
//-------------------------------------Script1 (Register into Elearning portal) ----------------------	
//	@Given("User navigates to Elearning application")
//	public void user_navigates_to_Elearning_application() {
//	   System.out.println("User is navigating to the Elearning application");
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ahishek Singh\\Downloads\\chromedriver.exe");
//		driver =new ChromeDriver();	
//		driver.get("http://elearningm1.upskills.in/index.php");
//		driver.findElement(By.xpath("//*[@id=\"login_block\"]/div/ul/li/a")).click();
//	}
//	
//	
//	@When("user enter {string} firstname and {string} lastname and {string} email and {string} username and {string} password and {string} confirm password")
//	public void user_enter_firstname_and_lastname_and_email_and_username_and_password_and_confirm_password(String firstname, String lastname, String email, String username, String password, String confirmpassword) {
//		driver.findElement(By.name("firstname")).sendKeys(firstname);
//	    driver.findElement(By.name("lastname")).sendKeys(lastname);
//	    driver.findElement(By.name("email")).sendKeys(email);
//	    driver.findElement(By.name("username")).sendKeys(username);
//	    driver.findElement(By.name("pass1")).sendKeys(password);
//	    driver.findElement(By.name("pass2")).sendKeys(confirmpassword);
//	}
//	
//	@When("user clicks on register button")
//	public void user_clicks_on_register_button() {
//		driver.findElement(By.name("submit")).click();
//	}
//	
//	@Then("user redirect to dashboard")
//	public void user_redirect_to_dashboard() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
//	}
//-------------------------------------------------------------------------------------------	
	
//-------------------------------------Script2 (Login into Elearning portal) --------------
	
	public String name;
@Given("User navigates to Elearning application")
	public void user_navigates_to_Elearning_application() {
	   System.out.println("User is navigating to the Elearning application");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ahishek Singh\\Downloads\\chromedriver.exe");
		driver =new ChromeDriver();	
		driver.get("http://elearningm1.upskills.in/index.php");
		
	}

@When("user enter {string} username and {string} password")
public void user_enter_username_and_password(String username, String password) {
   driver.findElement(By.name("login")).sendKeys(username);
   driver.findElement(By.name("password")).sendKeys(password);
}

@When("user clicks on Login button")
public void user_clicks_on_Login_button() {
	driver.findElement(By.name("submitAuth")).click();

}

@Then("user redirect to dashboad")
public void user_redirect_to_dashboad() {

}
@Then("user clicks on compose mail")
public void user_clicks_on_compose_mail() {
	driver.findElement(By.xpath("//*[@id=\"profileCollapse\"]/div/ul/li[2]/a")).click();
	
}

@Then("user choose recipient and enter subject line")
public void user_choose_recipient_and_enter_subject_line() {
	//driver.findElement(By.cssSelector("#compose_message > fieldset > div:nth-child(1) > div.col-sm-8 > span > span.selection > span > ul > li > input")).sendKeys("amit");
    driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Amit");
    try {
		Thread.sleep(5000l);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    name = driver.findElement(By.xpath("//span/ul/li[@role='treeitem']")).getText();
    System.out.println(name);
    driver.findElement(By.xpath("//span/ul/li[@role='treeitem']")).click();
//    try {
//		driver.wait(5000);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}

   // public static void sleep​(5000) throws InterruptedException;
    driver.findElement(By.xpath("//input[@name='title']")).sendKeys("Hello Amit");
   // driver.findElement(By.xpath("//li[text()='amit xyz']")).click();
//   throw new cucumber.api.PendingException();
   // System.out.println("");
}

@Then("Send the mail")
public void send_the_mail() {
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    String successMessage = driver.findElement(By.xpath("//div[contains(@class,'success')]")).getText();
    assertEquals(successMessage,String.format("The message has been sent to %s", name));       
   
}







	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
//	@Given("User navigate to facebook application")
//	public void user_navigate_to_facebook_application() {
//	    // Write code here that turns the phrase above into concrete actions
//	   System.out.println("User is navigating to the facebook application");
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ahishek Singh\\Downloads\\chromedriver.exe");
//		driver =new ChromeDriver();
//		
//		driver.get("https://www.facebook.com");
//	}
//
//	@When("User enters valid credential")
//	public void user_enters_valid_credential() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
//	}
//
//	@Then("user logged in successfully")
//	public void user_logged_in_successfully() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
//	}
//
//	@When("User enters invalid credential")
//	public void user_enters_invalid_credential() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
//	}
//
//	@Then("user gets validation message")
//	public void user_gets_validation_message() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
//	}
//
//
//}

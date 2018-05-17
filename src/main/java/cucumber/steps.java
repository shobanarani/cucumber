package cucumber;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;

//import cucumber.api.PendingException;
import cucumber.annotation.en.Given; 
import cucumber.annotation.en.Then; 
import cucumber.annotation.en.When; 
public class steps {
	
	public WebDriver driver;
	      
	   
	   
	@BeforeTest
	public void setup()
	{
	
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		 driver = new ChromeDriver(); 
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
		
	   @Given("^user navigates to Facebook$")
	   public void user_navigates_to_Facebook() throws Throwable {
		   
		   driver.get("https://www.google.com");
	       throw new Exception();
	   }

	   @When("^I enter correct username and password$")
	   public void i_enter_correct_username_and_password() throws Throwable {
	       // Write code here that turns the phrase above into concrete actions		   
		   driver.get("https://www.google.com");
		   throw new Exception();
	       
	       
	   }

	   @Then("^login should be successful$")
	   public void login_should_be_successful() throws Throwable {
		   
		   if(driver.findElement(By.id("gs_lc0")).isEnabled())
	 	      { 
		 	         System.out.println("Test 1 Pass"); 
		 	      } else { 
		 	         System.out.println("Test 1 Fail"); 
		 	      } 
		 	      driver.close();
	       // Write code here that turns the phrase above into concrete actions
		 	     throw new Exception();
	      
	   }


}

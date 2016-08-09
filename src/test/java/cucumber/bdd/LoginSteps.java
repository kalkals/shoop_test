package cucumber.bdd;

import java.util.logging.Logger;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.bdd.Pages.ShoopLoginPage;

public class LoginSteps {
	private static final Logger LOGGER = Logger.getLogger(LoginSteps.class.getName());
	ShoopLoginPage loginPage ;
	private WebDriver driver;
	public LoginSteps(BrowserDriver driver)
	{
		this.driver=driver;
	}
	@Given("^I visit the shoop sign-in page$")
    public void i_visit_the_shoop_sign_in_page() throws Throwable {
		LOGGER.info("Entering: I navigate to the mock application"); 
		BrowserDriver.loadPage("https://www.shoop.fr/toolbar/connection/");
		
     }
     @When("^I try to login with '(.+)' credentials$")
     public void i_try_to_login_with_valid_credentials(String credentials) throws Throwable {
    	 LOGGER.info("Entering: I try to login with " + credentials + " credentials");
    	 String email = null;
    	 String password = null;
    	 switch(credentials.toLowerCase()){
    	 case "valid":
    		 email ="test11@test.com";
    		 password ="password1";
    	 case "invalid":
    		 email ="test1@test.com";
    		 password ="password1";
    	 }
    	 loginPage = new ShoopLoginPage(driver);
    	 loginPage.enterEmail(email);
    	 loginPage.enterPassword(password);
    	 loginPage.submit();
    	 
     }
     @Then("^I should see that I logged in '(.+)'$")
     public void i_should_see_that_I_logged_in_successfully(String result) throws Throwable {
    	 switch(result){
    	 case "successfully":
    		 Assert.assertTrue(loginPage.isSuccessfullLogin());
    	 case "unsuccessfully":
    		 Assert.assertTrue(loginPage.isFailedLogin());
    	 break;
    	 }
     }
}

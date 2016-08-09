package cucumber.bdd.Pages;

import java.util.NoSuchElementException;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.bdd.Finders.LoginPageFinders;

public class ShoopLoginPage extends AbstractPageObjects{
	
	
		ShoopHomePage shoopHome;
		private static final Logger LOGGER = Logger.getLogger(ShoopLoginPage.class.getName());
		public ShoopLoginPage(WebDriver driver) {
			super(driver);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		protected By getUniqueElement() 
		{
			return LoginPageFinders.bySpan;
			
		}
		public void enterEmail(String email)
		{
			
			//driver.findElement(LoginPageFinders.byUsername).sendKeys(email);
			findElement(LoginPageFinders.byUsername).sendKeys(email);
		}
		public void enterPassword(String password)
		{
			//driver.findElement(LoginPageFinders.byPassword).sendKeys(password);
			findElement(LoginPageFinders.byPassword).sendKeys(password);
		}
		public void submit()
		{
			findElement(LoginPageFinders.bySubmit).click();
		}
		public boolean isSuccessfullLogin()
		{
			LOGGER.info("Check sucessful login");
			shoopHome = new ShoopHomePage(driver);
			return shoopHome.isHomePageDisplayed();
		}
		public boolean isFailedLogin()
		{
			boolean bool=false;
			try{
			LOGGER.info("Check login errors displayed");
			waitForElement(LoginPageFinders.byInvalidMessage);
			bool=true;
			}catch(NoSuchElementException e){e.printStackTrace();}
			return bool;
		}
	}



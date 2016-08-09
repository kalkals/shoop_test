package cucumber.bdd.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.bdd.Finders.HomePageFinders;
import cucumber.bdd.Finders.LoginPageFinders;

public class ShoopHomePage extends AbstractPageObjects{
	
	

	public ShoopHomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected By getUniqueElement() 
	{
		return HomePageFinders.byUniqueElement;
		
	}

	public boolean isHomePageDisplayed()
	{
		waitForElement(HomePageFinders.title);
		return findElement(HomePageFinders.title).isDisplayed();
	}
}

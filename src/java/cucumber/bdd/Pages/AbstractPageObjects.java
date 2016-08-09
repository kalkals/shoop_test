package cucumber.bdd.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public abstract class AbstractPageObjects {

	public static final int DEFAULT_WAIT_4_ELEMENT = 7;
	public static final int DEFAULT_WAIT_4_PAGE = 12;

	boolean m_belementFound = false;
	long m_ltimeOuInSeconds = 30;

	protected WebDriver driver;
	protected WebDriverWait wait;

	public AbstractPageObjects(WebDriver driver) {
		this.driver = driver;
		isLoaded();
	}

	protected abstract By getUniqueElement();

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void waitForElement(final By by) {
		ExpectedCondition e = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				d.findElement(by);
				return Boolean.valueOf(true);
			}
		};

		Wait w = new WebDriverWait(driver, 100);
		w.until(e);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void waitForElement(final By by, long seconds) {
		ExpectedCondition e = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				d.findElement(by);
				return Boolean.valueOf(true);
			}
		};

		Wait w = new WebDriverWait(driver, seconds);
		w.until(e);
	}


	protected void isLoaded() {
		this.wait = (new WebDriverWait(driver, m_ltimeOuInSeconds, 100));
		wait.until(ExpectedConditions.presenceOfElementLocated(getUniqueElement()));
	}
	
	public WebElement findElement(By by)
	{
		waitForElement(by);
		return driver.findElement(by);
	}

	
}

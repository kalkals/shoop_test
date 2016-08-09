package cucumber.bdd;

import java.util.logging.Logger;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class BrowserDriver extends EventFiringWebDriver{

	public static WebDriver driver;
	protected static String m_OS_Type = System.getProperty("os.name").toLowerCase();
	private static final Logger LOGGER = Logger.getLogger(BrowserDriver.class.getName());
	
	public BrowserDriver() {
		
		super(driver);
		
		// TODO Auto-generated constructor stub
	}
	
	static {
	    if (driver==null) {
	        
	        			        String path;
	        			        path =System.getProperty("user.dir")+"/util/chromedriver";
	        		    		
	        		            System.setProperty("webdriver.chrome.driver", path);
	        		            driver = new ChromeDriver();
	        		            
	        }
	    
	}

    @After
	  public void embedScreenshot(Scenario scenario) {
	System.out.println("in after-BaseClass");
	        try {
	            byte[] screenshot = getScreenshotAs(OutputType.BYTES);
	            scenario.embed(screenshot, "image/png");
	        } catch (org.openqa.selenium.WebDriverException somePlatformsDontSupportScreenshots) {
	            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
	        }
	        Runtime.getRuntime().addShutdownHook(new Thread() {
	            public void run() {
	            	System.out.println("quitting the driver");
	                driver.quit();
	                
	            }
	        });
	        
	    }
    public static void loadPage(String url){;
    LOGGER.info("Directing browser to:" + url);
    driver.get(url);
}
	public static boolean isUnix() {
		return (m_OS_Type.indexOf("nix") >= 0 || m_OS_Type.indexOf("nux") >= 0 || m_OS_Type.indexOf("aix") > 0);
	}


}

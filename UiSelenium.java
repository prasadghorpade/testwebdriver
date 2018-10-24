package framework;


import framework.AppProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;


public class UiSelenium {
	
	public static WebDriver driver;
	
	public void initializePrpperties() {		
		AppProperties.getProperties();		
	}
	
	
	public WebDriver getDriver() {
		
		//if(driver != null) 
		//	return driver;
		
		initializePrpperties();
		System.out.println("BrowserName: " + AppProperties.browser_name + AppProperties.browserLocation);
		switch (AppProperties.browser_name) {		
		case "chrome":
			System.setProperty("webdriver.chrome.driver", AppProperties.browserLocation);
			driver = new ChromeDriver();
			break;
		}
		
		return driver;
		
	}
	

}

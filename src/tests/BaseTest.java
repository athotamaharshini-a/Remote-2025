package tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
	
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod(alwaysRun = true) // alwaysRun ensures setup runs even when filtering groups
	public void setUp(String browser) {
	    if(browser.equalsIgnoreCase("chrome")) {
 	
	    	ChromeOptions options = new ChromeOptions();
	    	options.addArguments("--incognito");
	    	driver = new ChromeDriver(options);
	    	
	    }
	    else if(browser.equalsIgnoreCase("firefox")) driver = new FirefoxDriver();
	    else if(browser.equalsIgnoreCase("ie")) driver = new EdgeDriver();
	    
	    driver.get("https://www.saucedemo.com/");
	}
	
	protected WebDriver getDriver() {
		return driver;
	}

//	@BeforeMethod
//	public void setUp() {
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("https://www.saucedemo.com/");
//	
//	}

	@AfterMethod
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
	
}

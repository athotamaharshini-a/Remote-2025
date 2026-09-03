package project;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
////import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Parameters;
//
//public class BaseTest {
//	
//	WebDriver driver;
//	
//	@Parameters({"browser"})
//	@BeforeMethod(alwaysRun = true)
//	public void setup(String browser) {
//		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
//	if (browser.equalsIgnoreCase("chrome")) driver = new ChromeDriver();
//	else if(browser.equalsIgnoreCase("firefox")) driver = new ChromeDriver();
//	//else if(browser.equalsIgnoreCase("edge")) driver = new ChromeDriver();
//	driver.get("https://www.saucedemo.com/");
//	
//	}
////	@AfterMethod
////	public void tearDown()
////	{
////		if(driver != null) {
////			driver.quit();
////		}
////	}
//	
//
//}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {

  WebDriver driver;

  @Parameters({"browser"})
  @BeforeMethod(alwaysRun = true)
  public void setup(@Optional("chrome") String browser) {
      if (browser.equalsIgnoreCase("chrome")) {
          driver = new ChromeDriver();
      } else if (browser.equalsIgnoreCase("firefox")) {
          driver = new FirefoxDriver();
      } else {
          throw new IllegalArgumentException("Unsupported browser: " + browser);
      }

      driver.manage().window().maximize(); 
      driver.get("https://www.saucedemo.com/");
  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() {
      if (driver != null) {
          driver.quit();
      }
  }
}
package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Google {
	WebDriver driver;
	@Test(groups = {"smoke", "regression"})
	public void GoogleSearch() throws Exception
	{
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement searchbar = driver.findElement(By.name("q"));
		searchbar.sendKeys("Selenium Info");
		
		Thread.sleep(4000);
		
		driver.quit();
	}
}
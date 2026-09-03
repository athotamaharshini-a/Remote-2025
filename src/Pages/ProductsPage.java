package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
	
	WebDriver driver;
	
	@FindBy(id="react-burger-menu-btn")
	WebElement menuButton;
	
	@FindBy(id="logout_sidebar_link")
	WebElement logoutButton;
	
	public ProductsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void logout() {
		menuButton.click();
		logoutButton.click();
		
		driver.quit();
	}
	

}

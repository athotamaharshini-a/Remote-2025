package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.devtools.v146.fedcm.model.Loginstate;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
//	user-name
//	password
//	login-button
	
	WebDriver driver;
	//Locators
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement btnLogin; //----------finding elements here
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);//------writing a constructor and attach elements to the driver
	}
	//Actions
	public void login(String user, String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);
		btnLogin.click();
	}
}

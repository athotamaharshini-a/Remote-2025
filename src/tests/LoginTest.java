package tests;

import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.ProductsPage;

public class LoginTest extends BaseTest {
    
	@Test(groups = {"smoke"})
	public void testLogin() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		ProductsPage ProductsPage = new ProductsPage(driver);
		
		Thread.sleep(2000);

		loginPage.login("standard_user","secret_sauce");
		Thread.sleep(2000);
		ProductsPage.logout();
		
	
	}

}
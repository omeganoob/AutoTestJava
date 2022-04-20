package login;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import base.BaseTests;
import pages.LoginPage;

public class LoginTest extends BaseTests {
	 @Test
	    @DisplayName("TC02-Login Username invalid")
	    public void testLoginUserInvalid() throws InterruptedException{
	        loginPage.setUserName("Admin123");
	        Thread.sleep(1000);
	        loginPage.setPassword("Admin123");
	        Thread.sleep(1000);
	        loginPage.clickInpatientButton();
	        Thread.sleep(1000);
	        loginPage.clickLoginButton();

}
	 }

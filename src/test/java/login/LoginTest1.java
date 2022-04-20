package login;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import base.BaseTests;

public class LoginTest1 extends BaseTests {
	 @Test
	    @DisplayName("TC01-Login password invalid")
	    public void testLoginPassInvalid() throws InterruptedException{
	        loginPage.setUserName("Admin");
	        Thread.sleep(1000);
	        loginPage.setPassword("Admin12345");
	        Thread.sleep(1000);
	        loginPage.clickInpatientButton();
	        Thread.sleep(1000);
	        loginPage.clickLoginButton();
}
}
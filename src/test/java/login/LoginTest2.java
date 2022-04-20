package login;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import base.BaseTests;

public class LoginTest2 extends BaseTests {
	 @Test
	    @DisplayName("TC01-Login unselected location")
	    public void testLoginUnselectedLocation() throws InterruptedException{
	        loginPage.setUserName("Admin");
	        Thread.sleep(1000);
	        loginPage.setPassword("Admin123");
	        Thread.sleep(1000);
	        loginPage.clickLoginButton();
}
	}

package login;

import base.BaseTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoginTests extends BaseTests {
    @Test
    @DisplayName("TC01-Login successfully")
    public void testLoginSuccessfully() throws InterruptedException{
        loginPage.setUserName("Admin");
        Thread.sleep(1000);
        loginPage.setPassword("Admin123");
        Thread.sleep(1000);
        loginPage.clickInpatientButton();
        Thread.sleep(1000);
        loginPage.clickLoginButton();
     
    }
}

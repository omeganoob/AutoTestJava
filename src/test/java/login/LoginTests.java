package login;

import base.BaseTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoginTests extends BaseTests {
    @Test
    @DisplayName("TC01-Login successfully")
    public void testLoginSuccessfully(){
        loginPage.setUserName("Admin");
        loginPage.setPassword("Admin123");
        loginPage.clickInpatientButton();
        loginPage.clickLoginButton();
    }
}

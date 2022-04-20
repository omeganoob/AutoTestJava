package registerPatient;

import base.BaseTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.RegisterPatientPage;

public class registerPatientTests extends BaseTests {
    @Test
    @DisplayName("TC01-Logout successfully")
    public void testLogoutSuccessfully() throws InterruptedException{
        HomePage homePage = loginPage.loginToHomePage();
        RegisterPatientPage registerPatientPage = homePage.redirectToRegisterPatient();

    }
}

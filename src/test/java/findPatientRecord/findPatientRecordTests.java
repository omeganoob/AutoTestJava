package findPatientRecord;

import base.BaseTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.FindPatientRecordPage;
import pages.HomePage;
import pages.RegisterPatientPage;

public class findPatientRecordTests extends BaseTests {
    @Test
    @DisplayName("TC01-Find Patient Record")
    public void testFindPatientRecord(){
        HomePage homePage = loginPage.loginToHomePage();
        FindPatientRecordPage findPatientRecordPage = homePage.redirectToFindPatientRecord();
        findPatientRecordPage.setInputField("william");
    }
}

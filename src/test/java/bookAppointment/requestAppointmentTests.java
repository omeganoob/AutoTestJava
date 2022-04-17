package bookAppointment;

import base.BaseTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.*;

public class requestAppointmentTests extends BaseTests {
    @Test
    @DisplayName("TC01-Request an appointment")
    public void requestNewAppointment(){
        HomePage homePage = loginPage.loginToHomePage();
        FindPatientRecordPage findPatientRecordPage = homePage.redirectToFindPatientRecord();
        findPatientRecordPage.setInputField("");
        ViewThePatientPage viewThePatientPage = findPatientRecordPage.viewThePage();

        RequestAppointmentPage requestAppointmentPage = viewThePatientPage.redirectToRequestAppointmentPage();
//        requestAppointmentPage.setAppointmentType("Dermatology");
//        requestAppointmentPage.clickSaveButton();
    }
}

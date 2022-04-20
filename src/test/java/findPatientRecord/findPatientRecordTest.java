package findPatientRecord;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import base.BaseTests;
import pages.FindPatientRecordPage;
import pages.HomePage;

public class findPatientRecordTest extends BaseTests {
	   @Test
	    @DisplayName("TC01-Find Patient Record")
	    public void testFindPatientRecord() throws InterruptedException{
	    	Thread.sleep(1000);
	        HomePage homePage = loginPage.loginToHomePage();
	        FindPatientRecordPage findPatientRecordPage = homePage.redirectToFindPatientRecord();
	        findPatientRecordPage.setInputField("100HNY00");
	        Thread.sleep(1000);
	    }
}

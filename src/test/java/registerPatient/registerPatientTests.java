package registerPatient;

import base.BaseTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.RegisterPatientPage;

public class registerPatientTests extends BaseTests {
    @Test
    @DisplayName("TC06-Patient name filled")
    public void testPatientNameFilled() throws InterruptedException {
        HomePage homePage = loginPage.loginToHomePage();
        RegisterPatientPage registerPatientPage = homePage.redirectToRegisterPatient();
        registerPatientPage.setPatientName("Nguyen", "", "Chung");
        registerPatientPage.clickNextButton();
        Thread.sleep(5000);
    }

    @Test
    @DisplayName("TC07-unidentified box is checked")
    public void testUnIdentifiedChecked() throws InterruptedException {
        HomePage homePage = loginPage.loginToHomePage();
        RegisterPatientPage registerPatientPage = homePage.redirectToRegisterPatient();
        registerPatientPage.checkUnidentifiedBox();
        registerPatientPage.clickNextButton();
        Thread.sleep(5000);
    }

    @Test
    @DisplayName("TC08-Required field of patient's name is not filled and Unidentified box not checked")
    public void testNotFilledAndUnChecked() throws InterruptedException {
        HomePage homePage = loginPage.loginToHomePage();
        RegisterPatientPage registerPatientPage = homePage.redirectToRegisterPatient();
        registerPatientPage.clickNextButton();
        Thread.sleep(5000);
    }

    @Test
    @DisplayName("TC09-Gender is chosen")
    public void testGenderIsChosen() throws InterruptedException {
        HomePage homePage = loginPage.loginToHomePage();
        RegisterPatientPage registerPatientPage = homePage.redirectToRegisterPatient();
        registerPatientPage.setPatientName("Nguyen", "Quang", "Chung");
        registerPatientPage.clickNextButton();
//        registerPatientPage.clickG();
        registerPatientPage.clickNextButton();
        Thread.sleep(5000);
    }

    @Test
    @DisplayName("TC010-Gender is not chosen")
    public void testGenderIsNotChosen() throws InterruptedException {
        HomePage homePage = loginPage.loginToHomePage();
        RegisterPatientPage registerPatientPage = homePage.redirectToRegisterPatient();
        registerPatientPage.setPatientName("Nguyen", "Quang", "Chung");
        registerPatientPage.clickNextButton();
//        registerPatientPage.setGender();
        registerPatientPage.clickNextButton();
        Thread.sleep(5000);
    }

    @Test
    @DisplayName("TC11-Invalid Day")
    public void testInvalidDate() throws InterruptedException {
        HomePage homePage = loginPage.loginToHomePage();
        RegisterPatientPage registerPatientPage = homePage.redirectToRegisterPatient();
        registerPatientPage.setPatientName("Nguyen", "", "Chung");
        registerPatientPage.clickNextButton();
//        registerPatientPage.setGender();
        registerPatientPage.clickNextButton();
        registerPatientPage.setDayField("32");
        registerPatientPage.setMonthField(("1"));
//        registerPatientPage.setYearField(("2001"));
//        registerPatientPage.clickNextButton();
        Thread.sleep(5000);
    }

    @Test
    @DisplayName("TC012-Unselected Month")
    public void testUnselectedMonth() throws InterruptedException {
        HomePage homePage = loginPage.loginToHomePage();
        RegisterPatientPage registerPatientPage = homePage.redirectToRegisterPatient();
        registerPatientPage.setPatientName("Nguyen", "", "Chung");
        registerPatientPage.clickNextButton();
//        registerPatientPage.setGender();
        registerPatientPage.clickNextButton();
//        registerPatientPage.setBirthdateDayField("9","", "2021");
        registerPatientPage.setDayField("32");
//        registerPatientPage.setMonthField(("1"));
        registerPatientPage.setYearField(("2001"));
        registerPatientPage.clickNextButton();
        Thread.sleep(5000);
    }

    @Test
    @DisplayName("TC013-Invalid Year")
    public void testInvalidYear() throws InterruptedException {
        HomePage homePage = loginPage.loginToHomePage();
        RegisterPatientPage registerPatientPage = homePage.redirectToRegisterPatient();
        registerPatientPage.setPatientName("Nguyen", "", "Chung");
        registerPatientPage.clickNextButton();
//        registerPatientPage.setGender();
        registerPatientPage.clickNextButton();
        registerPatientPage.setBirthdateDayField("9","2", "0000");
        registerPatientPage.clickNextButton();
        Thread.sleep(5000);
    }

    @Test
    @DisplayName("TC014-Invalid Year")
    public void testInvalidDateInput() throws InterruptedException {
        HomePage homePage = loginPage.loginToHomePage();
        RegisterPatientPage registerPatientPage = homePage.redirectToRegisterPatient();
        registerPatientPage.setPatientName("Nguyen", "", "Chung");
        registerPatientPage.clickNextButton();
//        registerPatientPage.setGender();
        registerPatientPage.clickNextButton();
        registerPatientPage.setBirthdateDayField("a","2", "200a");
        registerPatientPage.clickNextButton();
        Thread.sleep(5000);
    }

    @Test
    @DisplayName("TC015-Valid Date but in the future")
    public void testFutureDate() throws InterruptedException {
        HomePage homePage = loginPage.loginToHomePage();
        RegisterPatientPage registerPatientPage = homePage.redirectToRegisterPatient();
        registerPatientPage.setPatientName("Nguyen", "", "Chung");
        registerPatientPage.clickNextButton();
//        registerPatientPage.setGender();
        registerPatientPage.clickNextButton();
        registerPatientPage.setBirthdateDayField("15","12", "2022");
        registerPatientPage.clickNextButton();
        Thread.sleep(5000);
    }

    @Test
    @DisplayName("TC016-Empty date and filled estimate")
    public void testFilledEstimate() throws InterruptedException {
        HomePage homePage = loginPage.loginToHomePage();
        RegisterPatientPage registerPatientPage = homePage.redirectToRegisterPatient();
        registerPatientPage.setPatientName("Nguyen", "", "Chung");
        registerPatientPage.clickNextButton();
//        registerPatientPage.setGender();
        registerPatientPage.clickNextButton();
        registerPatientPage.setEstimatedTime("15","8");
        registerPatientPage.clickNextButton();
        Thread.sleep(5000);
    }

    @Test
    @DisplayName("TC017-Empty date and filled estimate but month greater than 11")
    public void testInvalidEstimateMonth() throws InterruptedException {
        HomePage homePage = loginPage.loginToHomePage();
        RegisterPatientPage registerPatientPage = homePage.redirectToRegisterPatient();
        registerPatientPage.setPatientName("Nguyen", "", "Chung");
        registerPatientPage.clickNextButton();
//        registerPatientPage.setGender();
        registerPatientPage.clickNextButton();
        registerPatientPage.setEstimatedTime("15","12");
        registerPatientPage.clickNextButton();
        Thread.sleep(5000);
    }

    @Test
    @DisplayName("TC017-Invalid Estimate")
    public void testInvalidEstimate() throws InterruptedException {
        HomePage homePage = loginPage.loginToHomePage();
        RegisterPatientPage registerPatientPage = homePage.redirectToRegisterPatient();
        registerPatientPage.setPatientName("Nguyen", "", "Chung");
        registerPatientPage.clickNextButton();
//        registerPatientPage.setGender();
        registerPatientPage.clickNextButton();
        registerPatientPage.setEstimatedTime("-1","2");
        registerPatientPage.clickNextButton();
        Thread.sleep(5000);
    }

    @Test
    @DisplayName("TC018-Empty Address")
    public void testEmptyAddress() throws InterruptedException {
        HomePage homePage = loginPage.loginToHomePage();
        RegisterPatientPage registerPatientPage = homePage.redirectToRegisterPatient();
        registerPatientPage.setPatientName("Nguyen", "Quang", "Chung");
        registerPatientPage.clickNextButton();
//        registerPatientPage.setGender();
        registerPatientPage.clickNextButton();
        registerPatientPage.setEstimatedTime("21","10");
        registerPatientPage.clickNextButton();
        registerPatientPage.setAddress("1", "");
        Thread.sleep(5000);
    }

    @Test
    @DisplayName("TC019-Invalid Phone number format")
    public void testInvalidPhoneNumber() throws InterruptedException {
        HomePage homePage = loginPage.loginToHomePage();
        RegisterPatientPage registerPatientPage = homePage.redirectToRegisterPatient();
        registerPatientPage.setPatientName("Nguyen", "Quang", "Chung");
        registerPatientPage.clickNextButton();
//        registerPatientPage.setGender();
        registerPatientPage.clickNextButton();
        registerPatientPage.setEstimatedTime("21","10");
        registerPatientPage.clickNextButton();
        registerPatientPage.setAddress("1", "Da Nang");
        registerPatientPage.clickNextButton();
        registerPatientPage.setPhoneNumber("abc123");
        Thread.sleep(5000);
    }
}

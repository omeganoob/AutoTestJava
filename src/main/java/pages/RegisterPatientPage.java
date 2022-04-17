package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPatientPage {
    WebDriver driver;

    private By givenField = By.id("fr2241-field");
    private By middleField = By.id("fr8206-field");
    private By familyField = By.id("fr5139-field");

    private By genderField = By.id("gender-field");

    private By birthdateDayField = By.id("birthdateDay-field");
    private By birthdateMonthField = By.id("birthdateMonth-field");
    private By birthdateYearField = By.id("birthdateYear-field");

    private By estimatedYears = By.id("birthdateYears-field");
    private By estimatedMonths = By.id("birthdateMonths-field");


    private By nextBtn = By.id("next-button");

    public RegisterPatientPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setPatientName(String given, String middle, String family) {
        driver.findElement(givenField).sendKeys(given);
        driver.findElement(middleField).sendKeys(middle);
        driver.findElement(familyField).sendKeys(family);
    }

    public void setGender(String gender) {
//        new Select(driver.findElement(genderField).selectByVisibleText(gender);
    }

    public void clickNextButton() {
        driver.findElement(nextBtn).click();
    }
}

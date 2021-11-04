package com.upgrade.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetStartedPage {

    WebDriver driver;

    @FindBy(name = "borrowerFirstName")
    WebElement firstNameTxt;

    @FindBy(name = "borrowerLastName")
    WebElement lastNameTxt;

    @FindBy(name = "borrowerStreet")
    WebElement borrowerStreetTxt;

    @FindBy(name = "borrowerCity")
    WebElement borrowerCityTxt;

    @FindBy(name = "borrowerState")
    WebElement borrowerStateTxt;

    @FindBy(name = "borrowerZipCode")
    WebElement borrowerZipCodeTxt;

    @FindBy(name = "borrowerDateOfBirth")
    WebElement borrowerDateOfBirthTxt;

    @FindBy(xpath = "//button")
    WebElement continueBtn;

    public GetStartedPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterFirstname(String firstName) {
        firstNameTxt.sendKeys(firstName);
    }

    public void enterLastname(String lastName) {
        lastNameTxt.sendKeys(lastName);
    }

    public void enterStreet(String street) {
        borrowerStreetTxt.sendKeys(street);
    }

    public void enterCity(String city) {
        borrowerCityTxt.sendKeys(city);
    }

    public void enterState(String state) {
        borrowerStateTxt.sendKeys(state);
    }

    public void enterZip(String zipCode) {
        borrowerZipCodeTxt.sendKeys(zipCode);
    }

    public void enterDateOfBirth(String dateOfBirth) {
        borrowerDateOfBirthTxt.sendKeys(dateOfBirth);
    }

    public void clickContinueButton() {
        continueBtn.click();
    }
}

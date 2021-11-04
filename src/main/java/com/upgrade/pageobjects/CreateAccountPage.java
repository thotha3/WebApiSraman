package com.upgrade.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateAccountPage {

    WebDriver driver;

    @FindBy(xpath = "//*[@id='root']//form/div[1]/div[1]//input")
    WebElement emailAddressTxt;

    @FindBy(xpath = "//*[@id='root']//form/div[1]/div[2]//input")
    WebElement passwordTxt;

    @FindBy(xpath = "//*[@id='root']//form/div[2]/div/label/div[1]")
    WebElement agreeCbox;

    @FindBy(xpath = "//button")
    WebElement checkRateBtn;

    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterEmailAddress(String emailAddress) {
        emailAddressTxt.sendKeys(emailAddress);
    }

    public void enterPassword(String password) {
        passwordTxt.sendKeys(password);
    }

    public void checkAgreement() {
        agreeCbox.click();
    }

    public void clickCheckYourRateButton() {
        checkRateBtn.click();
    }
}

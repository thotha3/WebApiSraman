package com.upgrade.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div[1]/div/div/form/div[1]/div[1]/div/div/div/input")
    WebElement emailAddressTxt;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div[1]/div/div/form/div[1]/div[2]/div/div/div/input")
    WebElement passwordTxt;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div[1]/div/div/form/div[2]/div/label/div[1]")
    WebElement agreeCbox;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div[1]/div/div/form/div[3]/button")
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

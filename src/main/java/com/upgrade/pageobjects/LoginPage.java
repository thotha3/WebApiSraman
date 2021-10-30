package com.upgrade.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div/div/div/div/div/div/form/div/div[1]/div/div/div/input")
    WebElement emailAddressTxt;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div/div/div/div/div/div/form/div/div[2]/div/div/div[1]/input")
    WebElement passwordTxt;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div/div/div/div/div/div/form/button")
    WebElement signInBtn;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterEmailAddress(String emailAddress) {
        waitForElementVisibility(emailAddressTxt);
        emailAddressTxt.sendKeys(emailAddress);
    }

    public void enterPassword(String password) {
        passwordTxt.sendKeys(password);
    }

    public void clickSignInButton() {
        signInBtn.click();
    }

    public void waitForElementVisibility(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }
}

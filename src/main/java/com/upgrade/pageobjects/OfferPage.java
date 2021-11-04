package com.upgrade.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OfferPage {

    WebDriver driver;

    @FindBy(xpath = "//*[@id='root']/div/main/div/header/div/label")
    WebElement toggleNavBar;

    @FindBy(xpath = "//*[@id='root']/div/main/div/header/div/nav/ul/li[2]/a")
    WebElement logoutLink;

    @FindBy(xpath = "//*[@id='root']/div/main/div/div[2]/div[1]/div/div[1]/div[1]/div[1]/div[2]/span[2]")
    WebElement loanAmountTxt;

    @FindBy(xpath = "//*[@id='root']/div/main/div/div[2]/div[1]/div/div[1]/div[1]/div[3]/div/div/div/div[2]/div/div/ul/li[1]/div")
    WebElement monthlyPaymentTxt;

    @FindBy(xpath = "//*[@id='root']/div/main/div/div[2]/div[1]/div/div[1]/div[1]/div[3]/div/div/div/div[2]/div/div/ul/li[2]/div")
    WebElement termTxt;

    @FindBy(xpath = "//*[@id='root']/div/main/div/div[2]/div[1]/div/div[1]/div[1]/div[3]/div/div/div/div[2]/div/div/ul/li[3]/div")
    WebElement interestRateTxt;

    @FindBy(xpath = "//*[@id='root']/div/main/div/div[2]/div[1]/div/div[1]/div[1]/div[3]/div/div/div/div[2]/div/div/ul/li[4]/div")
    WebElement aprTxt;

    public OfferPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickToggleNavbar() {
        toggleNavBar.click();
    }

    public void clickSignOut() {
        waitForElementVisibility(logoutLink);
        logoutLink.click();
    }

    public String extractLoanAmount() {
        waitForElementVisibility(loanAmountTxt);
        return loanAmountTxt.getText();
    }

    public String extractMonthlyPayment() {
        return monthlyPaymentTxt.getText();
    }

    public String extractTerm() {
        return termTxt.getText();
    }

    public String extractInterestRate() {
        return interestRateTxt.getText();
    }

    public String extractApr() {
        return aprTxt.getText();
    }

    public void waitForElementVisibility(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }
}

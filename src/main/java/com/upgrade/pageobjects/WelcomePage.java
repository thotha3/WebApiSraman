package com.upgrade.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class WelcomePage {

    WebDriver driver;

    @FindBy(name = "desiredAmount")
    WebElement loanAmountTxt;

    @FindBy(xpath = "//select")
    WebElement loanPurposeSelect;

    @FindBy(xpath = "//button")
    WebElement checkRateBtn;

    public WelcomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterLoanAmount(String loanAmount) {
        loanAmountTxt.sendKeys(loanAmount);
    }

    public void enterLoanPurpose(String loanPurpose) {
        new Select(driver.findElement(By
                .xpath("//*[@id=\"root\"]/div/main/div/div/div/div[2]/div[2]/div[2]/form/div/div/div[2]/div/select")))
                .selectByVisibleText(loanPurpose);
    }

    public void clickCheckYourRateButton() {
        checkRateBtn.click();
    }
}

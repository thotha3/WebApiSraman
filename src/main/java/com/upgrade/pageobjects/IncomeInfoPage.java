package com.upgrade.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class IncomeInfoPage {

    WebDriver driver;

    @FindBy(xpath = "//*[@id='root']//form/div[1]/div[1]//input")
    WebElement borrowerIncomeTxt;

    @FindBy(xpath = "//*[@id='root']//form/div[1]/div[2]//input")
    WebElement borrowerAdditionalIncomeTxt;

    @FindBy(xpath = "//button")
    WebElement continueBtn;

    public IncomeInfoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterBorrowerIncome(String borrowerIncome) {
        borrowerIncomeTxt.sendKeys(borrowerIncome);
    }

    public void enterBorrowerAdditionalIncome(String borrowerAdditionalIncome) {
        borrowerAdditionalIncomeTxt.sendKeys(borrowerAdditionalIncome);
    }

    public void clickContinueButton() {
        continueBtn.click();
    }
}

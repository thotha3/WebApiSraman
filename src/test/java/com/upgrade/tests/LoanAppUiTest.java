package com.upgrade.tests;

import com.upgrade.pageobjects.*;
import com.upgrade.pojo.LoanDetails;
import com.upgrade.utilities.RandomGen;
import com.upgrade.utilities.ReadProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class LoanAppUiTest extends BaseTest {
    LoginPage loginPage;
    WelcomePage welcomePage;
    GetStartedPage getStartedPage;
    IncomeInfoPage incomeInfoPage;
    CreateAccountPage createAccountPage;
    OfferPage offerPage;
    LoanDetails loanDetails;

    private final String loanAmount = "2000";
    private final String loanPurpose = "Pay off Credit Cards";
    private final String borrowerStreet = "212 East 42nd Street";
    private final String borrowerCity = "New York";
    private final String borrowerState = "NY";
    private final String borrowerZip = "10017";
    private final String borrowerDob = "01/01/2000";
    private final String borrowerIncome = "130000";
    private final String borrowerAdditionalIncome = "10000";

    /**
     * Scenario that covers end-to-end
     */
    @Test
    public void endToEndScenario() {
        initializePages();
        performWelcomePageActions();
        performGetStartedPageActions();
        performIncomeInfoPageActions();

        String username = properties.getValue("upgrade.username")
                                    +RandomGen.randomInteger()+"@upgrade-challenge.com";
        String password = properties.getValue("upgrade.password");

        performCreateAccountPageActions(username, password);
        performOfferPageActions();
        performLoginPageActions(username, password);
        assertLoanDetailAndLogout();
    }

    public void initializePages() {
        loginPage = new LoginPage(driver);
        welcomePage = new WelcomePage(driver);
        getStartedPage = new GetStartedPage(driver);
        incomeInfoPage = new IncomeInfoPage(driver);
        createAccountPage = new CreateAccountPage(driver);
        offerPage = new OfferPage(driver);
        loanDetails = new LoanDetails();
    }

    public void performWelcomePageActions() {
        driver.get(UPGRADE_WEB_INTRO_URL);
        welcomePage.enterLoanAmount(loanAmount);
        welcomePage.enterLoanPurpose(loanPurpose);
        welcomePage.clickCheckYourRateButton();
    }

    public void performGetStartedPageActions() {
        getStartedPage.enterFirstname(RandomGen.randomString());
        getStartedPage.enterLastname(RandomGen.randomString());
        getStartedPage.enterStreet(borrowerStreet);
        getStartedPage.enterCity(borrowerCity);
        getStartedPage.enterState(borrowerState);
        getStartedPage.enterZip(borrowerZip);
        getStartedPage.enterDateOfBirth(borrowerDob);
        getStartedPage.clickContinueButton();
    }

    public void performIncomeInfoPageActions() {
        incomeInfoPage.enterBorrowerIncome(borrowerIncome);
        incomeInfoPage.enterBorrowerAdditionalIncome(borrowerAdditionalIncome);
        incomeInfoPage.clickContinueButton();
        incomeInfoPage.clickContinueButton();
    }

    public void performCreateAccountPageActions(String username, String password) {
        createAccountPage.enterEmailAddress(username);
        createAccountPage.enterPassword(password);
        createAccountPage.checkAgreement();
        createAccountPage.clickCheckYourRateButton();
    }

    public void performOfferPageActions() {
        loanDetails.setLoanAmount(offerPage.extractLoanAmount());
        loanDetails.setMonthlyPayment(offerPage.extractMonthlyPayment());
        loanDetails.setTerm(offerPage.extractTerm());
        loanDetails.setInterestRate(offerPage.extractInterestRate());
        loanDetails.setApr(offerPage.extractApr());

        offerPage.clickToggleNavbar();
        offerPage.clickSignOut();
    }

    public void performLoginPageActions(String username, String password) {
        driver.get(UPGRADE_WEB_LOGIN_URL);
        loginPage.enterEmailAddress(username);
        loginPage.enterPassword(password);
        loginPage.clickSignInButton();
    }

    public void assertLoanDetailAndLogout() {
        assertThat(offerPage.extractLoanAmount(), equalTo(loanDetails.getLoanAmount()));
        assertThat(offerPage.extractMonthlyPayment(), equalTo(loanDetails.getMonthlyPayment()));
        assertThat(offerPage.extractTerm(), equalTo(loanDetails.getTerm()));
        assertThat(offerPage.extractInterestRate(), equalTo(loanDetails.getInterestRate()));
        assertThat(offerPage.extractApr(), equalTo(loanDetails.getApr()));

        offerPage.clickToggleNavbar();
        offerPage.clickSignOut();
    }
}

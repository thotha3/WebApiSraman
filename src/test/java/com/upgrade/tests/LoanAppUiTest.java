package com.upgrade.tests;

import com.upgrade.pageobjects.*;
import com.upgrade.pojo.LoanDetails;
import com.upgrade.utilities.RandomGen;
import com.upgrade.utilities.ReadProperties;
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
        welcomePage.enterLoanAmount("2000");
        welcomePage.enterLoanPurpose("Pay off Credit Cards");
        welcomePage.clickCheckYourRateButton();
    }

    public void performGetStartedPageActions() {
        getStartedPage.enterFirstname(RandomGen.randomString());
        getStartedPage.enterLastname(RandomGen.randomString());
        getStartedPage.enterStreet("212 East 42nd Street");
        getStartedPage.enterCity("New York");
        getStartedPage.enterState("NY");
        getStartedPage.enterZip("10017");
        getStartedPage.enterDateOfBirth("01/01/2000");
        getStartedPage.clickContinueButton();
    }

    public void performIncomeInfoPageActions() {
        incomeInfoPage.enterBorrowerIncome("130000");
        incomeInfoPage.enterBorrowerAdditionalIncome("10000");
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

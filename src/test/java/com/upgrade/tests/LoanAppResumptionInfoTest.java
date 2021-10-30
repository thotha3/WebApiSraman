package com.upgrade.tests;

import com.upgrade.utilities.ReadProperties;
import io.restassured.RestAssured;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import com.upgrade.pojo.BorrowerResumptionInfo;
import com.upgrade.pojo.LoanAppResumptionInfo;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class LoanAppResumptionInfoTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(LoanAppResumptionInfoTest.class);

    // Expected Result
    private final Integer loanAppId = 101986069;
    private final String loanAppUuid = "611e03aa-81de-4bf3-ae33-3995e43d0cfb";
    private final String referrer = "LENDING_TREE";
    private final String status = "NEW";
    private final String productType = "PERSONAL_LOAN";
    private final String sourceSystem = "PARTNER_FUNNEL_V2";
    private final Double desiredAmount = 25000.00;
    private final String borrower_firstName = "Benjamin";
    private final String borrower_maskedEmail = "q********6@upgrade.com";
    private final Boolean borrower_ssnRequired = false;
    private final String borrower_state = "OH";
    private final String borrower_email = "qa.preprod210618211325366@upgrade.com";
    private final Boolean turnDown = false;
    private final Boolean hasLogin = false;
    private final Boolean canAddCollateral = false;
    private final Boolean checkingDiscountAvailable = false;
    private final String[] expresetOptions = {"LEAD_SECRET", "WIPE", "DEACTIVATE_USER"};

    @Test
    public void positiveResponseTestCase() {
        RestAssured.baseURI = UPGRADE_REST_BASEURI;
        RequestSpecification request = RestAssured.given();

        JSONObject requestBodyParams = new JSONObject();
        requestBodyParams.put("loanAppUuid", "b8096ec7-2150-405f-84f5-ae99864b3e96");
        requestBodyParams.put("skipSideEffects", true);

        request.header("x-cf-source-id", "coding-challenge");
        request.header("x-cf-corr-id", "ca992989-3241-4d17-9456-ed603cddceec");
        request.header("Content-Type", "application/json");

        request.body(requestBodyParams.toJSONString());

        Response response = request.post("/resume/byLeadSecret");

        LoanAppResumptionInfo loanInfo = response.as(LoanAppResumptionInfo.class, ObjectMapperType.JACKSON_2);
        BorrowerResumptionInfo borrowerInfo = loanInfo.getLoanAppResumptionInfo().getBorrowerResumptionInfo();

        assertThat(loanInfo.getLoanAppResumptionInfo().getLoanAppId(), equalTo(loanAppId));
        assertThat(loanInfo.getLoanAppResumptionInfo().getLoanAppUuid(), equalTo(loanAppUuid));
        assertThat(loanInfo.getLoanAppResumptionInfo().getReferrer(), equalTo(referrer));
        assertThat(loanInfo.getLoanAppResumptionInfo().getStatus(), equalTo(status));
        assertThat(loanInfo.getLoanAppResumptionInfo().getProductType(), equalTo(productType));
        assertThat(loanInfo.getLoanAppResumptionInfo().getSourceSystem(), equalTo(sourceSystem));
        assertThat(loanInfo.getLoanAppResumptionInfo().getDesiredAmount(), equalTo(desiredAmount));
        assertThat(borrowerInfo.getFirstName(), equalTo(borrower_firstName));
        assertThat(borrowerInfo.getMaskedEmail(), equalTo(borrower_maskedEmail));
        assertThat(borrowerInfo.getSsnRequired(), equalTo(borrower_ssnRequired));
        assertThat(borrowerInfo.getState(), equalTo(borrower_state));
        assertThat(borrowerInfo.getEmail(), equalTo(borrower_email));
        assertThat(loanInfo.getLoanAppResumptionInfo().getTurnDown(), equalTo(turnDown));
        assertThat(loanInfo.getLoanAppResumptionInfo().getHasLogin(), equalTo(hasLogin));
        assertThat(loanInfo.getLoanAppResumptionInfo().getCanAddCollateral(), equalTo(canAddCollateral));
        assertThat(loanInfo.getLoanAppResumptionInfo().getCheckingDiscountAvailable(), equalTo(checkingDiscountAvailable));

        List<String> resetOptions = loanInfo.getResetOptions();
        List<String> expResetOptions = Arrays.asList(expresetOptions);
        assertThat(resetOptions, equalTo(expResetOptions));
    }
}

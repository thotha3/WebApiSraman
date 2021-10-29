
package pojo.com.upgrade;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "loanAppId",
    "loanAppUuid",
    "referrer",
    "status",
    "productType",
    "sourceSystem",
    "desiredAmount",
    "borrowerResumptionInfo",
    "coBorrowerResumptionInfo",
    "turnDown",
    "hasLogin",
    "availableAppImprovements",
    "cashOutAmount",
    "canAddCollateral",
    "rewardProgramId",
    "rewardProgramCode",
    "addon",
    "isMobileDiscountApplied",
    "checkingDiscountAvailable"
})
@Generated("jsonschema2pojo")
public class LoanAppResumptionInfo__1 {

    @JsonProperty("loanAppId")
    private Integer loanAppId;
    @JsonProperty("loanAppUuid")
    private String loanAppUuid;
    @JsonProperty("referrer")
    private String referrer;
    @JsonProperty("status")
    private String status;
    @JsonProperty("productType")
    private String productType;
    @JsonProperty("sourceSystem")
    private String sourceSystem;
    @JsonProperty("desiredAmount")
    private Double desiredAmount;
    @JsonProperty("borrowerResumptionInfo")
    private BorrowerResumptionInfo borrowerResumptionInfo;
    @JsonProperty("coBorrowerResumptionInfo")
    private Object coBorrowerResumptionInfo;
    @JsonProperty("turnDown")
    private Boolean turnDown;
    @JsonProperty("hasLogin")
    private Boolean hasLogin;
    @JsonProperty("availableAppImprovements")
    private Object availableAppImprovements;
    @JsonProperty("cashOutAmount")
    private Object cashOutAmount;
    @JsonProperty("canAddCollateral")
    private Boolean canAddCollateral;
    @JsonProperty("rewardProgramId")
    private Object rewardProgramId;
    @JsonProperty("rewardProgramCode")
    private Object rewardProgramCode;
    @JsonProperty("addon")
    private Object addon;
    @JsonProperty("isMobileDiscountApplied")
    private Object isMobileDiscountApplied;
    @JsonProperty("checkingDiscountAvailable")
    private Boolean checkingDiscountAvailable;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("loanAppId")
    public Integer getLoanAppId() {
        return loanAppId;
    }

    @JsonProperty("loanAppId")
    public void setLoanAppId(Integer loanAppId) {
        this.loanAppId = loanAppId;
    }

    @JsonProperty("loanAppUuid")
    public String getLoanAppUuid() {
        return loanAppUuid;
    }

    @JsonProperty("loanAppUuid")
    public void setLoanAppUuid(String loanAppUuid) {
        this.loanAppUuid = loanAppUuid;
    }

    @JsonProperty("referrer")
    public String getReferrer() {
        return referrer;
    }

    @JsonProperty("referrer")
    public void setReferrer(String referrer) {
        this.referrer = referrer;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("productType")
    public String getProductType() {
        return productType;
    }

    @JsonProperty("productType")
    public void setProductType(String productType) {
        this.productType = productType;
    }

    @JsonProperty("sourceSystem")
    public String getSourceSystem() {
        return sourceSystem;
    }

    @JsonProperty("sourceSystem")
    public void setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
    }

    @JsonProperty("desiredAmount")
    public Double getDesiredAmount() {
        return desiredAmount;
    }

    @JsonProperty("desiredAmount")
    public void setDesiredAmount(Double desiredAmount) {
        this.desiredAmount = desiredAmount;
    }

    @JsonProperty("borrowerResumptionInfo")
    public BorrowerResumptionInfo getBorrowerResumptionInfo() {
        return borrowerResumptionInfo;
    }

    @JsonProperty("borrowerResumptionInfo")
    public void setBorrowerResumptionInfo(BorrowerResumptionInfo borrowerResumptionInfo) {
        this.borrowerResumptionInfo = borrowerResumptionInfo;
    }

    @JsonProperty("coBorrowerResumptionInfo")
    public Object getCoBorrowerResumptionInfo() {
        return coBorrowerResumptionInfo;
    }

    @JsonProperty("coBorrowerResumptionInfo")
    public void setCoBorrowerResumptionInfo(Object coBorrowerResumptionInfo) {
        this.coBorrowerResumptionInfo = coBorrowerResumptionInfo;
    }

    @JsonProperty("turnDown")
    public Boolean getTurnDown() {
        return turnDown;
    }

    @JsonProperty("turnDown")
    public void setTurnDown(Boolean turnDown) {
        this.turnDown = turnDown;
    }

    @JsonProperty("hasLogin")
    public Boolean getHasLogin() {
        return hasLogin;
    }

    @JsonProperty("hasLogin")
    public void setHasLogin(Boolean hasLogin) {
        this.hasLogin = hasLogin;
    }

    @JsonProperty("availableAppImprovements")
    public Object getAvailableAppImprovements() {
        return availableAppImprovements;
    }

    @JsonProperty("availableAppImprovements")
    public void setAvailableAppImprovements(Object availableAppImprovements) {
        this.availableAppImprovements = availableAppImprovements;
    }

    @JsonProperty("cashOutAmount")
    public Object getCashOutAmount() {
        return cashOutAmount;
    }

    @JsonProperty("cashOutAmount")
    public void setCashOutAmount(Object cashOutAmount) {
        this.cashOutAmount = cashOutAmount;
    }

    @JsonProperty("canAddCollateral")
    public Boolean getCanAddCollateral() {
        return canAddCollateral;
    }

    @JsonProperty("canAddCollateral")
    public void setCanAddCollateral(Boolean canAddCollateral) {
        this.canAddCollateral = canAddCollateral;
    }

    @JsonProperty("rewardProgramId")
    public Object getRewardProgramId() {
        return rewardProgramId;
    }

    @JsonProperty("rewardProgramId")
    public void setRewardProgramId(Object rewardProgramId) {
        this.rewardProgramId = rewardProgramId;
    }

    @JsonProperty("rewardProgramCode")
    public Object getRewardProgramCode() {
        return rewardProgramCode;
    }

    @JsonProperty("rewardProgramCode")
    public void setRewardProgramCode(Object rewardProgramCode) {
        this.rewardProgramCode = rewardProgramCode;
    }

    @JsonProperty("addon")
    public Object getAddon() {
        return addon;
    }

    @JsonProperty("addon")
    public void setAddon(Object addon) {
        this.addon = addon;
    }

    @JsonProperty("isMobileDiscountApplied")
    public Object getIsMobileDiscountApplied() {
        return isMobileDiscountApplied;
    }

    @JsonProperty("isMobileDiscountApplied")
    public void setIsMobileDiscountApplied(Object isMobileDiscountApplied) {
        this.isMobileDiscountApplied = isMobileDiscountApplied;
    }

    @JsonProperty("checkingDiscountAvailable")
    public Boolean getCheckingDiscountAvailable() {
        return checkingDiscountAvailable;
    }

    @JsonProperty("checkingDiscountAvailable")
    public void setCheckingDiscountAvailable(Boolean checkingDiscountAvailable) {
        this.checkingDiscountAvailable = checkingDiscountAvailable;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

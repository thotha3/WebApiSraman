
package com.upgrade.pojo;

import java.util.HashMap;
import java.util.List;
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
    "loanAppResumptionInfo",
    "offers",
    "selectedOffer",
    "requiredAgreements",
    "resetOptions",
    "originalLoanApp"
})
@Generated("jsonschema2pojo")
public class LoanAppResumptionInfo {

    @JsonProperty("loanAppResumptionInfo")
    private LoanAppResumptionInfo__1 loanAppResumptionInfo;
    @JsonProperty("offers")
    private List<Object> offers = null;
    @JsonProperty("selectedOffer")
    private Object selectedOffer;
    @JsonProperty("requiredAgreements")
    private List<Object> requiredAgreements = null;
    @JsonProperty("resetOptions")
    private List<String> resetOptions = null;
    @JsonProperty("originalLoanApp")
    private Object originalLoanApp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("loanAppResumptionInfo")
    public LoanAppResumptionInfo__1 getLoanAppResumptionInfo() {
        return loanAppResumptionInfo;
    }

    @JsonProperty("loanAppResumptionInfo")
    public void setLoanAppResumptionInfo(LoanAppResumptionInfo__1 loanAppResumptionInfo) {
        this.loanAppResumptionInfo = loanAppResumptionInfo;
    }

    @JsonProperty("offers")
    public List<Object> getOffers() {
        return offers;
    }

    @JsonProperty("offers")
    public void setOffers(List<Object> offers) {
        this.offers = offers;
    }

    @JsonProperty("selectedOffer")
    public Object getSelectedOffer() {
        return selectedOffer;
    }

    @JsonProperty("selectedOffer")
    public void setSelectedOffer(Object selectedOffer) {
        this.selectedOffer = selectedOffer;
    }

    @JsonProperty("requiredAgreements")
    public List<Object> getRequiredAgreements() {
        return requiredAgreements;
    }

    @JsonProperty("requiredAgreements")
    public void setRequiredAgreements(List<Object> requiredAgreements) {
        this.requiredAgreements = requiredAgreements;
    }

    @JsonProperty("resetOptions")
    public List<String> getResetOptions() {
        return resetOptions;
    }

    @JsonProperty("resetOptions")
    public void setResetOptions(List<String> resetOptions) {
        this.resetOptions = resetOptions;
    }

    @JsonProperty("originalLoanApp")
    public Object getOriginalLoanApp() {
        return originalLoanApp;
    }

    @JsonProperty("originalLoanApp")
    public void setOriginalLoanApp(Object originalLoanApp) {
        this.originalLoanApp = originalLoanApp;
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


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
    "firstName",
    "maskedEmail",
    "ssnRequired",
    "state",
    "email"
})
@Generated("jsonschema2pojo")
public class BorrowerResumptionInfo {

    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("maskedEmail")
    private String maskedEmail;
    @JsonProperty("ssnRequired")
    private Boolean ssnRequired;
    @JsonProperty("state")
    private String state;
    @JsonProperty("email")
    private String email;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("maskedEmail")
    public String getMaskedEmail() {
        return maskedEmail;
    }

    @JsonProperty("maskedEmail")
    public void setMaskedEmail(String maskedEmail) {
        this.maskedEmail = maskedEmail;
    }

    @JsonProperty("ssnRequired")
    public Boolean getSsnRequired() {
        return ssnRequired;
    }

    @JsonProperty("ssnRequired")
    public void setSsnRequired(Boolean ssnRequired) {
        this.ssnRequired = ssnRequired;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
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

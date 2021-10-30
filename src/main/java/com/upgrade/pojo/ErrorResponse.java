
package com.upgrade.pojo;

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
    "code",
    "codeName",
    "message",
    "retryable",
    "type",
    "httpStatus"
})
@Generated("jsonschema2pojo")
public class ErrorResponse {

    @JsonProperty("code")
    private Integer code;
    @JsonProperty("codeName")
    private String codeName;
    @JsonProperty("message")
    private String message;
    @JsonProperty("retryable")
    private Boolean retryable;
    @JsonProperty("type")
    private String type;
    @JsonProperty("httpStatus")
    private String httpStatus;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("code")
    public Integer getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(Integer code) {
        this.code = code;
    }

    @JsonProperty("codeName")
    public String getCodeName() {
        return codeName;
    }

    @JsonProperty("codeName")
    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonProperty("retryable")
    public Boolean getRetryable() {
        return retryable;
    }

    @JsonProperty("retryable")
    public void setRetryable(Boolean retryable) {
        this.retryable = retryable;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("httpStatus")
    public String getHttpStatus() {
        return httpStatus;
    }

    @JsonProperty("httpStatus")
    public void setHttpStatus(String httpStatus) {
        this.httpStatus = httpStatus;
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

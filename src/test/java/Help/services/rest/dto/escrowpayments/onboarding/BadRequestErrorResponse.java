package Help.services.rest.dto.escrowpayments.onboarding;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "timestamp",
        "error",
        "exception",
        "message",
        "error_id"
})
@Data

@JsonIgnoreProperties(ignoreUnknown = true)
public class BadRequestErrorResponse {

    @JsonProperty("timestamp")
    public String timestamp;
    @JsonProperty("error")
    public String error;
    @JsonProperty("exception")
    public String exception;
    @JsonProperty("message")
    public String message;
    @JsonProperty("error_id")
    public Integer errorId;
}
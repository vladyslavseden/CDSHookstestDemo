package Help.services.rest.dto.escrowpayments.payouts;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "timestamp",
        "error",
        "error_id",
        "exception",
        "message"
})
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
public class PayoutReferenceErrorResponse {

    @JsonProperty("timestamp")
    public String timestamp;
    @JsonProperty("error")
    public String error;
    @JsonProperty("error_id")
    public Integer errorId;
    @JsonProperty("exception")
    public String exception;
    @JsonProperty("message")
    public String message;
}
package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonPropertyOrder({
        "status",
        "processingState",
        "payoutState"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountHolderStatus implements Serializable {

    private final static long serialVersionUID = 7784997549114041263L;

    @JsonProperty("status")
    public String status;
    @JsonProperty("processingState")
    public ProcessingState processingState;
    @JsonProperty("payoutState")
    public PayoutState payoutState;
}
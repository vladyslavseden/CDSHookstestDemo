package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonPropertyOrder({
        "accountHolderCode",
        "disable",
        "reason",
        "stateType"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountHolderStatusRequest implements Serializable {
    private static final long serialVersionUID = -1219566752167171257L;

    @JsonProperty("accountHolderCode")
    public String accountHolderCode;
    @JsonProperty("disable")
    public String disable;
    @JsonProperty("reason")
    public String reason;
    @JsonProperty("stateType")
    public String stateType;
}

package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonPropertyOrder({
        "allowPayout",
        "disabled",
        "disableReason"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayoutState implements Serializable {

    private final static long serialVersionUID = -4741443118468820866L;

    @JsonProperty("allowPayout")
    public String allowPayout;
    @JsonProperty("disabled")
    public String disabled;
    @JsonProperty("disableReason")
    public String disableReason;
}
package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonPropertyOrder({
        "accountCode",
        "payoutSchedule"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Account implements Serializable {

    private final static long serialVersionUID = -6538530938342166604L;

    @JsonProperty("accountCode")
    public String accountCode;
    @JsonProperty("payoutSchedule")
    public PayoutSchedule payoutSchedule;
}
package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonPropertyOrder({
        "payoutScheduleReason",
        "payoutSchedule",
        "accountCode",
        "accountHolderCode"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountRequest implements Serializable {

    private static final long serialVersionUID = -4555640124127013535L;

    @JsonProperty("payoutScheduleReason")
    public String payoutScheduleReason;
    @JsonProperty("payoutSchedule")
    public PayoutSchedule payoutSchedule;
    @JsonProperty("accountCode")
    public String accountCode;
    @JsonProperty("accountHolderCode")
    public String accountHolderCode;
}
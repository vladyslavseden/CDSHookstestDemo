package Help.services.rest.dto.escrowpayments.payouts;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@JsonInclude(JsonInclude.Include.NON_NULL)

@JsonPropertyOrder({
        "vendor_type",
        "merchant_account_id",
        "amount",
        "bank_account_id",
        "description",
        "account_code"
})

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayoutRequest implements Serializable {

    private final static long serialVersionUID = 2755916932395530796L;

    @JsonProperty("vendor_type")
    public String vendorType;
    @JsonProperty("merchant_account_id")
    public String merchantAccountId;
    @JsonProperty("amount")
    public Amount amount;
    @JsonProperty("bank_account_id")
    public String bankAccountId;
    @JsonProperty("description")
    public String description;
    @JsonProperty("account_code")
    public String accountCode;
}

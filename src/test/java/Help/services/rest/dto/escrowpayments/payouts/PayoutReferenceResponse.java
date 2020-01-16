package Help.services.rest.dto.escrowpayments.payouts;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "vendor_type",
        "payout_reference",
        "merchant_account_id",
        "amount",
        "bank_account_id",
        "description",
        "account_code"
})
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
public class PayoutReferenceResponse implements Serializable {

    private final static long serialVersionUID = -5594074095117173798L;

    @JsonProperty("vendor_type")
    @NonNull
    public String vendorType;
    @JsonProperty("payout_reference")
    @NonNull
    public String payoutReference;
    @JsonProperty("merchant_account_id")
    @NonNull
    public String merchantAccountId;
    @JsonProperty("amount")
    @NonNull
    public Amount amount;
    @JsonProperty("bank_account_id")
    @NonNull
    public String bankAccountId;
    @JsonProperty("description")
    @NonNull
    public String description;
    @JsonProperty("account_code")
    @NonNull
    public String accountCode;
}
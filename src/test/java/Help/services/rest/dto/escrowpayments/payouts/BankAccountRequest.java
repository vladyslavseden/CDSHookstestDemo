package Help.services.rest.dto.escrowpayments.payouts;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "merchant_account_id",
        "account_number",
        "bank_code",
        "branch_code",
        "iban",
        "currency_code",
        "bank_name",
        "bank_bic_swift",
        "bank_city",
        "owner_details",
        "vendor_type"
})

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class BankAccountRequest implements Serializable {
    private final static long serialVersionUID = 365915856194780327L;

    @JsonProperty("merchant_account_id")
    public String merchantAccountId;
    @JsonProperty("account_number")
    public String accountNumber;
    @JsonProperty("bank_code")
    public String bankCode;
    @JsonProperty("branch_code")
    public String branchCode;
    @JsonProperty("iban")
    public String iban;
    @JsonProperty("currency_code")
    public String currencyCode;
    @JsonProperty("bank_name")
    public String bankName;
    @JsonProperty("bank_bic_swift")
    public String bankBicSwift;
    @JsonProperty("bank_city")
    public String bankCity;
    @JsonProperty("owner_details")
    public OwnerDetails ownerDetails;
    @JsonProperty("vendor_type")
    @NonNull
    public String vendorType;
}
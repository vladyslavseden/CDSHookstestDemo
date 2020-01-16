package Help.services.rest.dto.escrowpayments.onboarding;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

import java.io.Serializable;

@JsonPropertyOrder({
        "vendor_type",
        "merchant_account_external_id",
        "type",
        "contact_details",
        "identifications",
        "creation_date",
        "kyc_level",
        "merchant_account_id",
        "account_code",
        "gender",
        "merchant_category_code"
})

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MerchantAccountByIdResponse implements Serializable {
    private final static long serialVersionUID = 6992091553448576904L;

    @JsonProperty("vendor_type")
    @NonNull
    public String vendorType;
    @JsonProperty("merchant_account_external_id")
    public String merchantAccountExternalId;
    @JsonProperty("type")
    @NonNull
    public String type;
    @JsonProperty("contact_details")
    @NonNull
    public ContactDetails contactDetails;
    @JsonProperty("creation_date")
    public String creationDate;
    @JsonProperty("kyc_level")
    public String kycLevel;
    @JsonProperty("merchant_account_id")
    @NonNull
    public String merchantAccountId;
    @JsonProperty("account_code")
    @NonNull
    public String accountCode;
    @JsonProperty("gender")
    public String gender;
    @JsonProperty("merchant_category_code")
    public String merchantCategoryCode;
}

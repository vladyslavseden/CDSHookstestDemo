package Help.services.rest.dto.escrowpayments.onboarding;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonPropertyOrder({
        "vendor_type",
        "merchant_account_id",
        "merchant_account_external_id",
        "type",
        "email",
        "contact_details",
        "business_details",
        "merchant_category_code",
        "gender"
})

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MerchantAccountRequest implements Serializable {
    private final static long serialVersionUID = -8314623030732043504L;

    @JsonProperty("vendor_type")
    public String vendorType;
    @JsonProperty("merchant_account_id")
    public String merchantAccountId;
    @JsonProperty("merchant_account_external_id")
    public String merchantAccountExternalId;
    @JsonProperty("type")
    public String type;
    @JsonProperty("email")
    public String email;
    @JsonProperty("contact_details")
    public ContactDetails contactDetails;
    @JsonProperty("business_details")
    public BusinessDetails businessDetails;
    //Adyen specific, only for Individual Account Holder
    @JsonProperty("merchant_category_code")
    public String merchantCategoryCode;
    @JsonProperty("gender")
    public String gender;
}

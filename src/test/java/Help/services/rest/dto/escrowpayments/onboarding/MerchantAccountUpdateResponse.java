package Help.services.rest.dto.escrowpayments.onboarding;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@JsonPropertyOrder({
        "vendor_type",
        "merchant_account_id",
        "merchant_account_external_id",
        "stakeholder_ids",
        "status",
        "gender"
})

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MerchantAccountUpdateResponse implements Serializable {
    private final static long serialVersionUID = -527710762436170835L;

    @JsonProperty("vendor_type")
    @NonNull
    public String vendorType;
    @JsonProperty("merchant_account_id")
    @NonNull
    public String merchantAccountId;
    @JsonProperty("merchant_account_external_id")
    public String merchantAccountExternalId;
    @JsonProperty("stakeholder_ids")
    public List<StakeholderId> stakeholderIds = new ArrayList<StakeholderId>();
    @JsonProperty("status")
    @NonNull
    public String status;
    @JsonProperty("gender")
    public String gender;
}

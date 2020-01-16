package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@JsonPropertyOrder({
        "pspReference",
        "submittedAsync",
        "accountHolderCode",
        "accountHolderDetails",
        "accountHolderStatus",
        "accounts",
        "legalEntity",
        "verification"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountHolderResponse implements Serializable {
    private static final long serialVersionUID = -4777277025183418956L;

    @JsonProperty("pspReference")
    public String pspReference;
    @JsonProperty("submittedAsync")
    public String submittedAsync;
    @JsonProperty("accountHolderCode")
    public String accountHolderCode;
    @JsonProperty("accountHolderDetails")
    public AccountHolderDetails accountHolderDetails;
    @JsonProperty("accountHolderStatus")
    public AccountHolderStatus accountHolderStatus;
    @JsonProperty("accounts")
    public List<Accounts> accounts = new ArrayList<Accounts>();
    @JsonProperty("legalEntity")
    public String legalEntity;
    @JsonProperty("verification")
    public Verification verification;
}
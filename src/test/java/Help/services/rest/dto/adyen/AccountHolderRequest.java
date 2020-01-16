package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonPropertyOrder({
        "pspReference",
        "submittedAsync",
        "accountHolderCode",
        "accountHolderDetails",
        "accountHolderStatus",
        "createDefaultAccount",
        "legalEntity",
        "verification"
})

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountHolderRequest implements Serializable {

    private final static long serialVersionUID = 7567238019174449233L;

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
    @JsonProperty("createDefaultAccount")
    public String createDefaultAccount;
    @JsonProperty("legalEntity")
    public String legalEntity;
    @JsonProperty("verification")
    public Verification verification;
}
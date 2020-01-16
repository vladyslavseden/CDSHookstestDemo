package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonPropertyOrder({
        "pspReference",
        "submittedAsync",
        "accountHolderCode",
        "accountCode",
        "status"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountResponse implements Serializable {

    private static final long serialVersionUID = -2621287343628171198L;

    @JsonProperty("pspReference")
    public String pspReference;
    @JsonProperty("submittedAsync")
    public String submittedAsync;
    @JsonProperty("accountHolderCode")
    public String accountHolderCode;
    @JsonProperty("accountCode")
    public String accountCode;
    @JsonProperty("status")
    public String status;
}
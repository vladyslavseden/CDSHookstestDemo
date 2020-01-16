package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@JsonPropertyOrder({
        "pspReference",
        "submittedAsync",
        "balancePerAccount",
        "resultCode",
        "totalBalance"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountHolderBalance implements Serializable {

    private final static long serialVersionUID = -6060260590861395787L;
    @JsonProperty("pspReference")
    public String pspReference;
    @JsonProperty("submittedAsync")
    public String submittedAsync;
    @JsonProperty("balancePerAccount")
    public List<BalancePerAccount> balancePerAccount = new ArrayList<BalancePerAccount>();
    @JsonProperty("resultCode")
    public String resultCode;
    @JsonProperty("totalBalance")
    public TotalBalance totalBalance;
}

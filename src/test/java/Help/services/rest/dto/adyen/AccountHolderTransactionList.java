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
        "accountTransactionLists",
        "resultCode"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountHolderTransactionList implements Serializable {
    private final static long serialVersionUID = 719732839873132984L;

    @JsonProperty("pspReference")
    public String pspReference;
    @JsonProperty("submittedAsync")
    public String submittedAsync;
    @JsonProperty("accountTransactionLists")
    public List<AccountTransactionList> accountTransactionLists = new ArrayList<AccountTransactionList>();
    @JsonProperty("resultCode")
    public String resultCode;
}

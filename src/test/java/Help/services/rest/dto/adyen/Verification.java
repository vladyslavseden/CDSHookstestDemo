package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@JsonPropertyOrder({
        "accountHolder",
        "shareholders",
        "bankAccounts"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Verification implements Serializable {

    private final static long serialVersionUID = 155516334191877658L;

    @JsonProperty("accountHolder")
    public AccountHolder accountHolder;
    @JsonProperty("shareholders")
    public List<Shareholders> shareholders = new ArrayList<Shareholders>();
    @JsonProperty("bankAccounts")
    public List<BankAccount> bankAccounts = new ArrayList<BankAccount>();
}
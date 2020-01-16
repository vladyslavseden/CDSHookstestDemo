package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonPropertyOrder({
        "AccountDetailBalance"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BalancePerAccount implements Serializable {

    private final static long serialVersionUID = -8751054053708658208L;

    @JsonProperty("AccountDetailBalance")
    public AccountDetailBalance accountDetailBalance;
}

package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonPropertyOrder({
        "accountCode"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountDetailBalance implements Serializable {
    private final static long serialVersionUID = 409508962937677708L;

    @JsonProperty("accountCode")
    public String accountCode;
    @JsonProperty("detailBalance")
    public DetailBalance detailBalance;
}

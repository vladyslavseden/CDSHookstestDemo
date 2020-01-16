package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonPropertyOrder({
        "reference",
        "merchantAccount",
        "card",
        "amount",
        "additionalData"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthorizeRequest implements Serializable {

    private final static long serialVersionUID = 3663555824872520579L;

    @JsonProperty("reference")
    public String reference;
    @JsonProperty("merchantAccount")
    public String merchantAccount;
    @JsonProperty("card")
    public Card card;
    @JsonProperty("amount")
    public Amount amount;
    @JsonProperty("additionalData")
    public AdditionalData additionalData;

}

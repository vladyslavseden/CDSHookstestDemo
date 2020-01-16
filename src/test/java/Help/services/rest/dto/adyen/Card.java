package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonPropertyOrder({
        "number",
        "cvc",
        "expiryMonth",
        "expiryYear",
        "holderName"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Card implements Serializable {

    private final static long serialVersionUID = 2180414623905243128L;
    
    @JsonProperty("number")
    public String number;
    @JsonProperty("cvc")
    public String cvc;
    @JsonProperty("expiryMonth")
    public String expiryMonth;
    @JsonProperty("expiryYear")
    public String expiryYear;
    @JsonProperty("holderName")
    public String holderName;

}

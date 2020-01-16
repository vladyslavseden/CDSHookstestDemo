package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;


@JsonPropertyOrder({
        "BankAccountDetail"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BankAccountDetails implements Serializable {

    private final static long serialVersionUID = 4058458336089491743L;

    @JsonProperty("BankAccountDetail")
    public BankAccountDetail bankAccountDetail;
}
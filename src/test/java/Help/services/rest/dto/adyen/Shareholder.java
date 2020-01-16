package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonPropertyOrder({
        "ShareholderContact"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Shareholder implements Serializable {

    private final static long serialVersionUID = 7167697267164637061L;

    @JsonProperty("ShareholderContact")
    public ShareholderContact shareholderContact;
}

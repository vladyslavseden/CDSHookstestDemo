package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonPropertyOrder({
        "originalReference",
        "reference",
        "merchantAccount",
        "modificationAmount"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CaptureRequest implements Serializable {

    private final static long serialVersionUID = 6544699876998087842L;

    @JsonProperty("originalReference")
    public String originalReference;
    @JsonProperty("reference")
    public String reference;
    @JsonProperty("merchantAccount")
    public String merchantAccount;
    @JsonProperty("modificationAmount")
    public ModificationAmount modificationAmount;

}

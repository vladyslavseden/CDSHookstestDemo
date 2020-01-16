package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonPropertyOrder({
        "additionalData",
        "pspReference",
        "resultCode",
        "authCode"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthorizeResponse implements Serializable {

    private final static long serialVersionUID = 8541151707525266044L;

    @JsonProperty("additionalData")
    public AdditionalData additionalData;
    @JsonProperty("pspReference")
    public String pspReference;
    @JsonProperty("resultCode")
    public String resultCode;
    @JsonProperty("authCode")
    public String authCode;
}

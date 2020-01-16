package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonPropertyOrder({
        "phoneCountryCode",
        "phoneNumber",
        "phoneType"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PhoneNumber implements Serializable {

    private final static long serialVersionUID = -400113257199679474L;

    @JsonProperty("phoneCountryCode")
    public String phoneCountryCode;
    @JsonProperty("phoneNumber")
    public String phoneNumber;
    @JsonProperty("phoneType")
    public String phoneType;

}

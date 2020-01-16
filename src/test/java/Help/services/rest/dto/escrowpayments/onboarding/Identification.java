package Help.services.rest.dto.escrowpayments.onboarding;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonPropertyOrder({
        "type",
        "value",
        "issuer_country_code"
})

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Identification implements Serializable {
    private final static long serialVersionUID = -735293443625193256L;

    @JsonProperty("type")
    public String type;
    @JsonProperty("value")
    public String value;
    @JsonProperty("issuer_country_code")
    public String issuerCountryCode;

}

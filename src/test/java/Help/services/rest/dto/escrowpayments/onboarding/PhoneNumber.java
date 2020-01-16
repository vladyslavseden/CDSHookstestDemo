package Help.services.rest.dto.escrowpayments.onboarding;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

import java.io.Serializable;

@JsonPropertyOrder({
        "type",
        "phone_country_code",
        "phone_number"
})

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class PhoneNumber implements Serializable {
    private final static long serialVersionUID = -6387841854903139870L;

    @JsonProperty("type")
    @NonNull
    public String type;
    @JsonProperty("phone_country_code")
    public String phoneCountryCode;
    @JsonProperty("phone_number")
    public String phoneNumber;

}

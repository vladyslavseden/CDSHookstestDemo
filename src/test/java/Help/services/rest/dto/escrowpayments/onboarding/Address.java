package Help.services.rest.dto.escrowpayments.onboarding;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

import java.io.Serializable;

@JsonPropertyOrder({
        "type",
        "house_number_or_name",
        "street",
        "city",
        "state_or_province",
        "postal_code",
        "country_code"
})


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Address implements Serializable {
    private final static long serialVersionUID = 7562415063064101504L;

    @JsonProperty("type")
    @NonNull
    public String type;
    @JsonProperty("house_number_or_name")
    @NonNull
    public String houseNumberOrName;
    @JsonProperty("street")
    @NonNull
    public String street;
    @JsonProperty("city")
    @NonNull
    public String city;
    @JsonProperty("state_or_province")
    public String stateOrProvince;
    @JsonProperty("postal_code")
    @NonNull
    public String postalCode;
    @JsonProperty("country_code")
    @NonNull
    public String countryCode;
}

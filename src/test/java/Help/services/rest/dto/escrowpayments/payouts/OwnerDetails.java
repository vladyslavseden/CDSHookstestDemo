package Help.services.rest.dto.escrowpayments.payouts;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "date_of_birth",
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
@JsonIgnoreProperties(ignoreUnknown = true)
public class OwnerDetails implements Serializable {
    private final static long serialVersionUID = -536732161525538888L;

    @JsonProperty("name")
    public String name;
    @JsonProperty("date_of_birth")
    public String dateOfBirth;
    @JsonProperty("house_number_or_name")
    public String houseNumberOrName;
    @JsonProperty("street")
    public String street;
    @JsonProperty("city")
    public String city;
    @JsonProperty("state_or_province")
    public String stateOrProvince;
    @JsonProperty("postal_code")
    public String postalCode;
    @JsonProperty("country_code")
    public String countryCode;
}
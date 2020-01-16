package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonPropertyOrder({
        "city",
        "country",
        "houseNumberOrName",
        "postalCode",
        "stateOrProvince",
        "street"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Address implements Serializable {

    private final static long serialVersionUID = 2778170994631808923L;

    @JsonProperty("city")
    public String city;
    @JsonProperty("country")
    public String country;
    @JsonProperty("houseNumberOrName")
    public String houseNumberOrName;
    @JsonProperty("postalCode")
    public String postalCode;
    @JsonProperty("stateOrProvince")
    public String stateOrProvince;
    @JsonProperty("street")
    public String street;

}

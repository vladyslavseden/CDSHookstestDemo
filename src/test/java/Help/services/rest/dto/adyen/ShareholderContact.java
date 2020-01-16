package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonPropertyOrder({
        "address",
        "email",
        "name",
        "shareholderCode",
        "personalData",
        "phoneNumber"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShareholderContact implements Serializable {

    private final static long serialVersionUID = 2636073475117038636L;

    @JsonProperty("address")
    public Address address;
    @JsonProperty("email")
    public String email;
    @JsonProperty("name")
    public Name name;
    @JsonProperty("shareholderCode")
    public String shareholderCode;
    @JsonProperty("personalData")
    public PersonalData personalData;
    @JsonProperty("phoneNumber")
    public PhoneNumber phoneNumber;
}

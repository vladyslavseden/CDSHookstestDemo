package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@JsonPropertyOrder({
        "address",
        "bankAccountDetails",
        "businessDetails",
        "email",
        "individualDetails",
        "merchantCategoryCode",
        "phoneNumber",
        "webAddress"
})

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountHolderDetails implements Serializable {

    private final static long serialVersionUID = 9351210703789756L;

    @JsonProperty("address")
    public Address address;
    @JsonProperty("bankAccountDetails")
    public List<BankAccountDetails> bankAccountDetails = new ArrayList<BankAccountDetails>();
    @JsonProperty("businessDetails")
    public BusinessDetails businessDetails;
    @JsonProperty("email")
    public String email;
    @JsonProperty("individualDetails")
    public IndividualDetails individualDetails;
    @JsonProperty("merchantCategoryCode")
    public String merchantCategoryCode;
    @JsonProperty("phoneNumber")
    public PhoneNumber phoneNumber;
    @JsonProperty("webAddress")
    public String webAddress;
}
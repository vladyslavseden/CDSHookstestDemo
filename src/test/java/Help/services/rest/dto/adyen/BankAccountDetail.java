package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonPropertyOrder({
        "accountNumber",
        "bankAccountName",
        "bankCity",
        "bankName",
        "branchCode",
        "bankAccountUUID",
        "bankBicSwift",
        "countryCode",
        "currencyCode",
        "ownerCity",
        "ownerCountryCode",
        "ownerDateOfBirth",
        "ownerHouseNumberOrName",
        "ownerName",
        "ownerNationality",
        "ownerPostalCode",
        "ownerState",
        "ownerStreet",
        "primaryAccount",
        "taxId",
        "iban"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BankAccountDetail implements Serializable {

    private final static long serialVersionUID = 6803616489699982637L;

    @JsonProperty("accountNumber")
    public String accountNumber;
    @JsonProperty("bankAccountName")
    public String bankAccountName;
    @JsonProperty("bankCity")
    public String bankCity;
    @JsonProperty("bankName")
    public String bankName;
    @JsonProperty("branchCode")
    public String branchCode;
    @JsonProperty("bankAccountUUID")
    public String bankAccountUUID;
    @JsonProperty("bankBicSwift")
    public String bankBicSwift;
    @JsonProperty("countryCode")
    public String countryCode;
    @JsonProperty("currencyCode")
    public String currencyCode;
    @JsonProperty("ownerCity")
    public String ownerCity;
    @JsonProperty("ownerCountryCode")
    public String ownerCountryCode;
    @JsonProperty("ownerDateOfBirth")
    public String ownerDateOfBirth;
    @JsonProperty("ownerHouseNumberOrName")
    public String ownerHouseNumberOrName;
    @JsonProperty("ownerName")
    public String ownerName;
    @JsonProperty("ownerNationality")
    public String ownerNationality;
    @JsonProperty("ownerPostalCode")
    public String ownerPostalCode;
    @JsonProperty("ownerState")
    public String ownerState;
    @JsonProperty("ownerStreet")
    public String ownerStreet;
    @JsonProperty("primaryAccount")
    public String primaryAccount;
    @JsonProperty("taxId")
    public String taxId;
    @JsonProperty("iban")
    public String iban;
}
package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonPropertyOrder({
        "split.api",
        "split.nrOfItems",
        "split.totalAmount",
        "split.currencyCode",
        "split.item1.amount",
        "split.item1.type",
        "split.item1.account",
        "split.item1.reference",
        "split.item1.description",
        "cvcResult",
        "authCode",
        "avsResult",
        "cardBin",
        "aliasType",
        "avsResultRaw",
        "alias",
        "cvcResultRaw",
        "refusalReasonRaw",
        "acquirerCode",
        "acquirerReference"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AdditionalData implements Serializable {

    private final static long serialVersionUID = 244566923071750470L;

    @JsonProperty("split.api")
    public String splitApi;
    @JsonProperty("split.nrOfItems")
    public String splitNrOfItems;
    @JsonProperty("split.totalAmount")
    public String splitTotalAmount;
    @JsonProperty("split.currencyCode")
    public String splitCurrencyCode;
    @JsonProperty("split.item1.amount")
    public String splitItem1Amount;
    @JsonProperty("split.item1.type")
    public String splitItem1Type;
    @JsonProperty("split.item1.account")
    public String splitItem1Account;
    @JsonProperty("split.item1.reference")
    public String splitItem1Reference;
    @JsonProperty("split.item1.description")
    public String splitItem1Description;
    @JsonProperty("cvcResult")
    public String cvcResult;
    @JsonProperty("authCode")
    public String authCode;
    @JsonProperty("avsResult")
    public String avsResult;
    @JsonProperty("cardBin")
    public String cardBin;
    @JsonProperty("aliasType")
    public String aliasType;
    @JsonProperty("avsResultRaw")
    public String avsResultRaw;
    @JsonProperty("alias")
    public String alias;
    @JsonProperty("cvcResultRaw")
    public String cvcResultRaw;
    @JsonProperty("refusalReasonRaw")
    public String refusalReasonRaw;
    @JsonProperty("acquirerCode")
    public String acquirerCode;
    @JsonProperty("acquirerReference")
    public String acquirerReference;
}

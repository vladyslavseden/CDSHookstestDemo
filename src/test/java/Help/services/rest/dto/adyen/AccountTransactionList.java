package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonPropertyOrder({
        "AccountTransactionList"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountTransactionList implements Serializable {

    private final static long serialVersionUID = 2675408330419049482L;

    @JsonProperty("AccountTransactionList")
    public accountTransactionLists accountTransactionLists;

}

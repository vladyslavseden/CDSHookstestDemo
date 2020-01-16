package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonPropertyOrder({
        "accountCode",
        "hasNextPage"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class accountTransactionLists implements Serializable {

    private final static long serialVersionUID = 8847463048444532253L;

    @JsonProperty("accountCode")
    public String accountCode;
    @JsonProperty("hasNextPage")
    public String hasNextPage;

}

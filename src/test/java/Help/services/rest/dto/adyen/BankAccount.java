package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@JsonPropertyOrder({
        "bankAccountUUID",
        "checks"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BankAccount implements Serializable {

    private final static long serialVersionUID = -650610950913140531L;

    @JsonProperty("bankAccountUUID")
    public String bankAccountUUID;
    @JsonProperty("checks")
    public List<Check> checks = new ArrayList<Check>();
}
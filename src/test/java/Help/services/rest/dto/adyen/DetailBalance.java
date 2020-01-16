package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@JsonPropertyOrder({
        "balance",
        "pendingBalance"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DetailBalance implements Serializable {

    private final static long serialVersionUID = -5090054666952344843L;

    @JsonProperty("balance")
    public List<Balance> balance = new ArrayList<Balance>();
    @JsonProperty("pendingBalance")
    public List<PendingBalance> pendingBalance = new ArrayList<PendingBalance>();
}

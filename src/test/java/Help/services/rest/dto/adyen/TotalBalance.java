package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@JsonPropertyOrder({
        "pendingBalance"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TotalBalance implements Serializable {

    private final static long serialVersionUID = -4529618674767244975L;

    @JsonProperty("pendingBalance")
    public List<PendingBalance> pendingBalance = new ArrayList<PendingBalance>();

}

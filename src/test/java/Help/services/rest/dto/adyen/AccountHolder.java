package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@JsonPropertyOrder({
        "checks"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountHolder implements Serializable {

    private final static long serialVersionUID = 4685586768011794893L;

    @JsonProperty("checks")
    public List<Check> checks = new ArrayList<Check>();
}
package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@JsonPropertyOrder({
        "shareholderCode",
        "checks"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Shareholders implements Serializable {

    private final static long serialVersionUID = -8965314322462700250L;

    @JsonProperty("shareholderCode")
    public String shareholderCode;
    @JsonProperty("checks")
    public List<Check> checks = new ArrayList<Check>();

}

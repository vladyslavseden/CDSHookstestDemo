package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@JsonPropertyOrder({
        "pspReference",
        "submittedAsync",
        "tierConfiguration"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TierConfiguration implements Serializable {
    private final static long serialVersionUID = 4230506462931155178L;

    @JsonProperty("pspReference")
    public String pspReference;
    @JsonProperty("submittedAsync")
    public String submittedAsync;
    @JsonProperty("tierConfiguration")
    public List<Tiers> tierConfiguration = new ArrayList<Tiers>();
}

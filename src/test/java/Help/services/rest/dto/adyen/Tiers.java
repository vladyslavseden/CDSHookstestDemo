package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@JsonPropertyOrder({
        "countryCode",
        "tiers"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Tiers implements Serializable {

    private final static long serialVersionUID = 8116494291628020396L;

    @JsonProperty("countryCode")
    public String countryCode;
    @JsonProperty("tiers")
    public List<Tier> tiers = new ArrayList<Tier>();

}

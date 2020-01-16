package Help.services.rest.dto.adyen;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonPropertyOrder({
        "tierNumber",
        "fromAmount",
        "toAmount",
        "deadlineConfiguration"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Tier implements Serializable {
    private static final long serialVersionUID = 2476375670041530214L;

    @JsonProperty("tierNumber")
    public Long tierNumber;
    @JsonProperty("fromAmount")
    public FromAmount fromAmount;
    @JsonProperty("toAmount")
    public ToAmount toAmount;
    @JsonProperty("deadlineConfiguration")
    public String deadlineConfiguration;
}

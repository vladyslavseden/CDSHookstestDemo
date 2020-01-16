package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonPropertyOrder({
        "disabled",
        "processedFrom",
        "tierNumber"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProcessingState implements Serializable {

    private final static long serialVersionUID = -4561600945222895898L;

    @JsonProperty("disabled")
    public String disabled;
    @JsonProperty("processedFrom")
    public ProcessedFrom processedFrom;
    @JsonProperty("tierNumber")
    public Integer tierNumber;
}
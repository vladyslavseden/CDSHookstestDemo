package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;


@JsonPropertyOrder({
        "currency",
        "value"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProcessedFrom implements Serializable {

    private final static long serialVersionUID = -1479868416497235537L;

    @JsonProperty("currency")
    public String currency;
    @JsonProperty("value")
    public Integer value;
}
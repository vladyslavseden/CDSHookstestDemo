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
public class ToAmount implements Serializable {
    private static final long serialVersionUID = 8396844275475100474L;

    @JsonProperty("currency")
    public String currency;
    @JsonProperty("value")
    public Long value;

}
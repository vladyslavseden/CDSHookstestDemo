package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonPropertyOrder({
        "value",
        "currency"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ModificationAmount implements Serializable {

    private final static long serialVersionUID = 7072624218271472515L;

    @JsonProperty("value")
    public Long value;
    @JsonProperty("currency")
    public String currency;

}

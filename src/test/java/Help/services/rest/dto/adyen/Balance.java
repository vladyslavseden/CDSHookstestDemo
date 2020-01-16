package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonPropertyOrder({
        "Amount"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Balance implements Serializable {

    private final static long serialVersionUID = -5502309755215940131L;

    @JsonProperty("Amount")
    public Amount amount;

}

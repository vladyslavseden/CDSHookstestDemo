package Help.services.rest.dto.escrowpayments.onboarding;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonPropertyOrder({
        "type",
        "name"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Names implements Serializable {
    private final static long serialVersionUID = -3718917540559923477L;

    @JsonProperty("type")
    public String type;
    @JsonProperty("name")
    public String name;

}

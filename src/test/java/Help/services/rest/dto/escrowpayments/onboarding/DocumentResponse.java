package Help.services.rest.dto.escrowpayments.onboarding;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@JsonPropertyOrder({
        "status"
})

@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentResponse implements Serializable {

    private final static long serialVersionUID = -6485277943068653759L;

    @JsonProperty("status")
    public String status;

}

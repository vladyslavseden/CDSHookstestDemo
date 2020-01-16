package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonPropertyOrder({
        "pspReference",
        "response"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CaptureResponse implements Serializable {

    private final static long serialVersionUID = 3405293345512971800L;

    @JsonProperty("pspReference")
    public String pspReference;
    @JsonProperty("response")
    public String response;

}

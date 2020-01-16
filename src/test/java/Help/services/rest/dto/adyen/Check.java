package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@JsonPropertyOrder({
        "type",
        "status",
        "requiredFields"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Check implements Serializable {

    private final static long serialVersionUID = -462416138064623646L;
    
    @JsonProperty("type")
    public String type;
    @JsonProperty("status")
    public String status;
    @JsonProperty("requiredFields")
    public List<String> requiredFields = new ArrayList<String>();
}
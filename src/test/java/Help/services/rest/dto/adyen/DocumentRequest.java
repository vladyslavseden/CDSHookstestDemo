package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonPropertyOrder({
        "documentContent",
        "documentDetail"
})
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentRequest implements Serializable {

    private final static long serialVersionUID = 543940520944843096L;
    
    @JsonProperty("documentContent")
    public String documentContent;
    @JsonProperty("documentDetail")
    public DocumentDetail documentDetail;
}

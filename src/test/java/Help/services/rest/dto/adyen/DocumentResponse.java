package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@JsonPropertyOrder({
        "pspReference",
        "submittedAsync",
        "documentDetails"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentResponse implements Serializable {

    private final static long serialVersionUID = -8375401576368147509L;

    @JsonProperty("pspReference")
    public String pspReference;
    @JsonProperty("submittedAsync")
    public String submittedAsync;
    @JsonProperty("documentDetails")
    public List<DocumentDetails> documentDetails = new ArrayList<DocumentDetails>();
}

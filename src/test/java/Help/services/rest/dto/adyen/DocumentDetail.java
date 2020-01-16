package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonPropertyOrder({
        "accountHolderCode",
        "documentType",
        "filename",
        "description"
})
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentDetail implements Serializable {

    private final static long serialVersionUID = -3766653178496983293L;

    @JsonProperty("accountHolderCode")
    public String accountHolderCode;
    @JsonProperty("documentType")
    public String documentType;
    @JsonProperty("filename")
    public String filename;
    @JsonProperty("description")
    public String description;
}

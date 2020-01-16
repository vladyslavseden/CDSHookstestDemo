package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonPropertyOrder({
        "DocumentDetail"
})
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentDetails implements Serializable {
    private final static long serialVersionUID = 3577661765135632905L;

    @JsonProperty("DocumentDetail")
    public DocumentDetail documentDetail;
}

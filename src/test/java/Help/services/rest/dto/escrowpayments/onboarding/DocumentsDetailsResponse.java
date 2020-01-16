package Help.services.rest.dto.escrowpayments.onboarding;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "document_details"
})
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentsDetailsResponse {

    @JsonProperty("document_details")
    public List<UploadedDocumentDetails> documentDetails;

}
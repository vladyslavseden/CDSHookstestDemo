package Help.services.rest.dto.escrowpayments.onboarding;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "filename",
        "type",
        "stakeholder_id",
        "description"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UploadedDocumentDetails {

    @JsonProperty("filename")
    public String filename;
    @JsonProperty("type")
    public String type;
    @JsonProperty("stakeholder_id")
    public String stakeholderId;
    @JsonProperty("description")
    public String description;

}
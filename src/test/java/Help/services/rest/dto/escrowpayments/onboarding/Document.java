package Help.services.rest.dto.escrowpayments.onboarding;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

import java.io.Serializable;

@JsonPropertyOrder({
        "vendor_type",
        "type",
        "filename",
        "document_format",
        "content",
        "stakeholder_id"
})

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Document implements Serializable {
    private final static long serialVersionUID = -952684114801036661L;

    @JsonProperty("vendor_type")
    @NonNull
    public String vendorType;
    @JsonProperty("type")
    public String type;
    @JsonProperty("filename")
    public String filename;
    @JsonProperty("document_format")
    public String documentFormat;
    @JsonProperty("content")
    public String content;
    @JsonProperty("stakeholder_id")
    @NonNull
    public String stakeholderId;

}

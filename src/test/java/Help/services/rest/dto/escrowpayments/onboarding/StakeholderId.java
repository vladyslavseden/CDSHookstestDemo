package Help.services.rest.dto.escrowpayments.onboarding;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

import java.io.Serializable;

@JsonPropertyOrder({
        "email",
        "stakeholder_id"
})

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class StakeholderId implements Serializable {
    private final static long serialVersionUID = -4704833996270624705L;

    @JsonProperty("email")
    @NonNull
    public String email;
    @JsonProperty("stakeholder_id")
    @NonNull
    public String stakeholderId;
}

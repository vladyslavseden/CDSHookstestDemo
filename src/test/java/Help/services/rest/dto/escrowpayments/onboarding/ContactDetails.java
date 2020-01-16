package Help.services.rest.dto.escrowpayments.onboarding;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@JsonPropertyOrder({
        "first_name",
        "last_name",
        "date_of_birth",
        "nationality",
        "address",
        "identifications"
})

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContactDetails implements Serializable {
    private final static long serialVersionUID = 4018340598469234850L;

    @JsonProperty("first_name")
    public String firstName;
    @JsonProperty("last_name")
    public String lastName;
    @JsonProperty("date_of_birth")
    public String dateOfBirth;
    @JsonProperty("nationality")
    public String nationality;
    @JsonProperty("address")
    @NonNull
    public Address address;
    @JsonProperty("identifications")
    public List<Identification> identifications;
}

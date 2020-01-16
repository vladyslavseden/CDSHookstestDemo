package Help.services.rest.dto.escrowpayments.onboarding;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@JsonPropertyOrder({
        "name",
        "email",
        "date_of_birth",
        "nationality",
        "address",
        "phone_numbers",
        "stakeholder_id",
        "identifications"
})

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Stakeholder implements Serializable {
    private final static long serialVersionUID = 1375682305407741722L;

    @JsonProperty("name")
    @NonNull
    public Name name;
    @JsonProperty("email")
    @NonNull
    public String email;
    @JsonProperty("date_of_birth")
    public String dateOfBirth;
    @JsonProperty("nationality")
    public String nationality;
    @JsonProperty("address")
    public Address address;
    @JsonProperty("phone_numbers")
    public List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
    @JsonProperty("stakeholder_id")
    public String stakeholderId;
    @JsonProperty("identifications")
    public List<Identification> identifications = new ArrayList<Identification>();

}

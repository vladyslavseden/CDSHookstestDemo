package Help.services.rest.dto.escrowpayments.onboarding;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonPropertyOrder({
        "first_name",
        "last_name",
        "gender"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Name implements Serializable {
    private final static long serialVersionUID = -2435225417678525079L;

    @JsonProperty("first_name")
    public String firstName;
    @JsonProperty("last_name")
    public String lastName;
    @JsonProperty("gender")
    public String gender;

}

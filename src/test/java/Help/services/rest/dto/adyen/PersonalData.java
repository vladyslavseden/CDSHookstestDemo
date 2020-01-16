package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonPropertyOrder({
        "dateOfBirth",
        "idNumber",
        "nationality"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonalData implements Serializable {

    private final static long serialVersionUID = 430752083333227200L;

    @JsonProperty("dateOfBirth")
    public String dateOfBirth;
    @JsonProperty("idNumber")
    public String idNumber;
    @JsonProperty("nationality")
    public String nationality;

}

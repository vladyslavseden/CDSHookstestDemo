package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@JsonPropertyOrder({
        "firstName",
        "gender",
        "lastName"
})

@Data
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Name implements Serializable {

    private final static long serialVersionUID = 1939601086525972971L;

    @JsonProperty("firstName")
    public String firstName;
    @JsonProperty("gender")
    public String gender;
    @JsonProperty("lastName")
    public String lastName;
}
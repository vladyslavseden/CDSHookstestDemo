package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonPropertyOrder({
        "Account"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Accounts implements Serializable {

    private final static long serialVersionUID = 2388030218954437650L;

    @JsonProperty("Account")
    public Account account;
}
package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;

@JsonPropertyOrder({
        "schedule"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayoutSchedule implements Serializable {

    private final static long serialVersionUID = 1343771237749276774L;

    @JsonProperty("schedule")
    public String schedule;

}
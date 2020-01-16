package Help.services.rest.dto.escrowpayments.onboarding;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@JsonPropertyOrder({
        "names",
        "stakeholders"
        //,"identifications"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BusinessDetails implements Serializable {
    private final static long serialVersionUID = 2274755044146805587L;

    @JsonProperty("names")
    public List<Names> names = new ArrayList<Names>();
    @JsonProperty("stakeholders")
    public List<Stakeholder> stakeholders = new ArrayList<Stakeholder>();
//    @JsonProperty("identifications")
//    public List<Identification> identifications = new ArrayList<Identification>();
}

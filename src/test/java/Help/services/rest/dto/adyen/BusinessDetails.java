package Help.services.rest.dto.adyen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@JsonPropertyOrder({
        "doingBusinessAs",
        "legalBusinessName",
        "shareholders",
        "taxId"
})

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BusinessDetails implements Serializable {

    private final static long serialVersionUID = -8841878403730553600L;
    
    @JsonProperty("doingBusinessAs")
    public String doingBusinessAs;
    @JsonProperty("legalBusinessName")
    public String legalBusinessName;
    @JsonProperty("shareholders")
    public List<Shareholder> shareholders = new ArrayList<Shareholder>();
    @JsonProperty("taxId")
    public String taxId;
}

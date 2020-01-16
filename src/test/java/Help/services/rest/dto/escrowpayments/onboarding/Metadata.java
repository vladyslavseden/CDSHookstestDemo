package Help.services.rest.dto.escrowpayments.onboarding;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Metadata implements Serializable {
    private final static long serialVersionUID = 4879562870164904841L;

    private Map<String,String> map = new HashMap<>();
    @JsonAnyGetter
    public Map<String,String> getMap() {
        return this.map;
    }
    public void setMap(Map<String, String> map) {
        this.map = map;
    }
    @JsonAnySetter
    public void addValue(String key, String value) {
        this.map.put(key, value);
    }
}

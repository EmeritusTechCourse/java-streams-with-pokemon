import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Minimum",
    "Maximum"
})
public class Weight {

    @JsonProperty("Minimum")
    private String minimum;
    @JsonProperty("Maximum")
    private String maximum;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Minimum")
    public String getMinimum() {
        return minimum;
    }

    @JsonProperty("Minimum")
    public void setMinimum(String minimum) {
        this.minimum = minimum;
    }

    @JsonProperty("Maximum")
    public String getMaximum() {
        return maximum;
    }

    @JsonProperty("Maximum")
    public void setMaximum(String maximum) {
        this.maximum = maximum;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

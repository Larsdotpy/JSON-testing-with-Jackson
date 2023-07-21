package DifficultJsonTests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Experimental {
    @JsonProperty("feature1")
    private boolean feature1;

    @JsonProperty("feature2")
    private boolean feature2;

    @JsonProperty("feature3")
    private boolean feature3;

    // Getters and setters (or Lombok annotations) for feature1, feature2, and feature3
}

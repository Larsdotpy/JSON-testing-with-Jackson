package DifficultJsonTests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Experimental {
    public Experimental(boolean feature1, boolean feature2, boolean feature3) {
        this.feature1 = feature1;
        this.feature2 = feature2;
        this.feature3 = feature3;
    }

    @JsonProperty("feature1")
    private boolean feature1;

    @JsonProperty("feature2")
    private boolean feature2;

    @JsonProperty("feature3")
    private boolean feature3;

    // Getters and setters (or Lombok annotations) for feature1, feature2, and feature3
}

package DifficultJsonTests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AdvancedOptions {
    @JsonProperty("show_hidden")
    private boolean showHidden;

    @JsonProperty("debug_mode")
    private boolean debugMode;

    @JsonProperty("experimental")
    private Experimental experimental;

    // Getters and setters (or Lombok annotations) for showHidden, debugMode, and experimental
}

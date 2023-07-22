package DifficultJsonTests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AdvancedOptions {
    public AdvancedOptions(boolean showHidden, boolean debugMode, Experimental experimental) {
        this.showHidden = showHidden;
        this.debugMode = debugMode;
        this.experimental = experimental;
    }

    @JsonProperty("show_hidden")
    private boolean showHidden;

    @JsonProperty("debug_mode")
    private boolean debugMode;

    @JsonProperty("experimental")
    private Experimental experimental;

    // Getters and setters (or Lombok annotations) for showHidden, debugMode, and experimental
}

package DifficultJsonTests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Settings {
    @JsonProperty("auto-login")
    private boolean autoLogin;

    @JsonProperty("advanced_options")
    private AdvancedOptions advancedOptions;

    // Getters and setters (or Lombok annotations) for autoLogin and advancedOptions
}

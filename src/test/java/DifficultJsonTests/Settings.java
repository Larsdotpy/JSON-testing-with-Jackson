package DifficultJsonTests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Settings {

    public Settings(boolean autoLogin, AdvancedOptions advancedOptions) {
        this.autoLogin = autoLogin;
        this.advancedOptions = advancedOptions;
    }

    @JsonProperty("auto-login")
    private boolean autoLogin;

    @JsonProperty("advanced_options")
    private AdvancedOptions advancedOptions;

    // Getters and setters (or Lombok annotations) for autoLogin and advancedOptions
}

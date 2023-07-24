package DifficultJsonTests;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.NoArgsConstructor;

import java.util.List;

@lombok.Data
@NoArgsConstructor
public class Data {
    @JsonProperty("users")
    private List<Users> users;
}

@lombok.Data
@NoArgsConstructor
class Settings {

    public Settings(boolean autoLogin, AdvancedOptions advancedOptions) {
        this.autoLogin = autoLogin;
        this.advancedOptions = advancedOptions;
    }

    @JsonProperty("auto-login")
    private boolean autoLogin;

    @JsonProperty("advanced_options")
    private AdvancedOptions advancedOptions;
}

@lombok.Data
@NoArgsConstructor
class AdvancedOptions {
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
}

@lombok.Data
@NoArgsConstructor
class Experimental {
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
}

@lombok.Data
@NoArgsConstructor
class SocialMedia {
    public SocialMedia(String facebook, String twitter, String instagram, String linkedin) {
        this.facebook = facebook;
        this.twitter = twitter;
        this.instagram = instagram;
        this.linkedin = linkedin;
    }

    @JsonProperty("facebook")
    private String facebook;

    @JsonProperty("twitter")
    private String twitter;

    @JsonProperty("instagram")
    private String instagram;

    @JsonProperty("linkedin")
    private String linkedin;
}


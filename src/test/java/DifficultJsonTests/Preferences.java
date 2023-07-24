package DifficultJsonTests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NoArgsConstructor;

@lombok.Data
@NoArgsConstructor
public class Preferences {
    public Preferences(String theme, boolean notifications, String language, Settings settings) {
        this.theme = theme;
        this.notifications = notifications;
        this.language = language;
        this.settings = settings;
    }

    @JsonProperty("theme")
    private String theme;

    @JsonProperty("notifications")
    private boolean notifications;

    @JsonProperty("language")
    private String language;

    @JsonProperty("settings")
    private Settings settings;

    public boolean getNotifications() {
        return notifications;
    }
}

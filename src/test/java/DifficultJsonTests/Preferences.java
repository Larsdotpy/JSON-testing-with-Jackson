package DifficultJsonTests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
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

    // Getters and setters (or Lombok annotations) for theme, notifications, language, and settings
}

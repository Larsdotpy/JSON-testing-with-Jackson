package DifficultJsonTests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Preferences {
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

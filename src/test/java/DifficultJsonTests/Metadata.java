package DifficultJsonTests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Metadata {
    @JsonProperty("app")
    private AppInfo app;

    @JsonProperty("author")
    private Author author;

    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("contributors")
    private List<Contributors> contributors;

    @JsonProperty("tags")
    private List<String> tags;
}

@NoArgsConstructor
@Data
class AppInfo {
    public AppInfo(String name, String version, String description) {
        this.name = name;
        this.version = version;
        this.description = description;
    }

    @JsonProperty("name")
    private String name;

    @JsonProperty("version")
    private String version;

    @JsonProperty("description")
    private String description;
}


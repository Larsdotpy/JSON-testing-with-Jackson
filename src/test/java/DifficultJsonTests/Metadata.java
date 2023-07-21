package DifficultJsonTests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Metadata {
    @JsonProperty("app")
    private AppInfo app;

    @JsonProperty("author")
    private Author author;

    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("contributors")
    private List<Contributor> contributors;

    @JsonProperty("tags")
    private List<String> tags;

    // Getters and setters (or Lombok annotations) for app, author, createdAt, contributors, and tags
}

package DifficultJsonTests;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    private List<Contributor> contributors;

    @JsonProperty("tags")
    private List<String> tags;
}

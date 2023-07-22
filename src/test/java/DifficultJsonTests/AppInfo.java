package DifficultJsonTests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.Data;


@NoArgsConstructor
@Data
public class AppInfo {
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

package DifficultJsonTests;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class JsonData {
    @JsonProperty("metadata")
    private Metadata metadata;

    @JsonProperty("data")
    private Data data;

    // Getters and setters (or Lombok annotations) for metadata and data
}

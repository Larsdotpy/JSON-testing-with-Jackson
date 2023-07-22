package DifficultJsonTests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NoArgsConstructor;

@lombok.Data
@NoArgsConstructor
public class JsonData {
    @JsonProperty("metadata")
    private Metadata metadata;

    @JsonProperty("data")
    private Data data;
}

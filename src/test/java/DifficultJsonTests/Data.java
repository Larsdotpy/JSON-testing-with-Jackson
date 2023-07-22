package DifficultJsonTests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NoArgsConstructor;

import java.util.List;

@lombok.Data
@NoArgsConstructor
public class Data {
    @JsonProperty("users")
    private List<User> users;

    // Getters and setters (or Lombok annotations) for users
}

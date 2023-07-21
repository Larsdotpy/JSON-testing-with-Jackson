package DifficultJsonTests;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@lombok.Data
public class Data {
    @JsonProperty("users")
    private List<User> users;

    // Getters and setters (or Lombok annotations) for users
}

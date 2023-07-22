package DifficultJsonTests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class User {
    @JsonProperty("id")
    private int id;

    @JsonProperty("username")
    private String username;

    @JsonProperty("profile")
    private Profile profile;

    @JsonProperty("orders")
    private List<Order> orders;

    // Getters and setters (or Lombok annotations) for id, username, profile, and orders
}

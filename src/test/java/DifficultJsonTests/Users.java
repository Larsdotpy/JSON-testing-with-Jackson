package DifficultJsonTests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NoArgsConstructor;

import java.util.List;

@lombok.Data
@NoArgsConstructor
public class Users {
    @JsonProperty("id")
    private int id;

    @JsonProperty("username")
    private String username;

    @JsonProperty("profile")
    private Profile profile;

    @JsonProperty("orders")
    private List<Orders> orders;
}

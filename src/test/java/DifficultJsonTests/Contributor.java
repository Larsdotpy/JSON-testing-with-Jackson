package DifficultJsonTests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Contributor {
    @JsonProperty("name")
    private String name;

    @JsonProperty("age")
    private int age;

    @JsonProperty("contact")
    private Contact contact;

    // Getters and setters (or Lombok annotations) for name, age, and contact
}

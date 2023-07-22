package DifficultJsonTests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Contributor {
    public Contributor(String name, int age, Contact contact) {
        this.name = name;
        this.age = age;
        this.contact = contact;
    }

    @JsonProperty("name")
    private String name;

    @JsonProperty("age")
    private int age;

    @JsonProperty("contact")
    private Contact contact;

    // Getters and setters (or Lombok annotations) for name, age, and contact
}

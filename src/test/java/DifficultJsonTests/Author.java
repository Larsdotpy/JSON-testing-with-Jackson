package DifficultJsonTests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Author {
    public Author(String name, int age, Contact contact) {
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
}

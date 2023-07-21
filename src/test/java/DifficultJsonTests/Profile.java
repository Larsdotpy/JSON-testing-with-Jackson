package DifficultJsonTests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Profile {
    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("age")
    private int age;

    @JsonProperty("gender")
    private String gender;

    @JsonProperty("contact")
    private Contact contact;

    @JsonProperty("preferences")
    private Preferences preferences;

    @JsonProperty("social_media")
    private SocialMedia socialMedia;

    // Getters and setters (or Lombok annotations) for firstName, lastName, age, gender, contact, preferences, and socialMedia
}

package DifficultJsonTests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NoArgsConstructor;

@lombok.Data
@NoArgsConstructor
public class Profile {
    public Profile(String firstName, String lastName, int age, String gender, Contact contact, Preferences preferences, SocialMedia socialMedia) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.contact = contact;
        this.preferences = preferences;
        this.socialMedia = socialMedia;
    }

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
}

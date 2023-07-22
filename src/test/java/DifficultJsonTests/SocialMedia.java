package DifficultJsonTests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SocialMedia {
    public SocialMedia(String facebook, String twitter, String instagram, String linkedin) {
        this.facebook = facebook;
        this.twitter = twitter;
        this.instagram = instagram;
        this.linkedin = linkedin;
    }

    @JsonProperty("facebook")
    private String facebook;

    @JsonProperty("twitter")
    private String twitter;

    @JsonProperty("instagram")
    private String instagram;

    @JsonProperty("linkedin")
    private String linkedin;

    // Getters and setters (or Lombok annotations) for facebook, twitter, instagram, and linkedin
}

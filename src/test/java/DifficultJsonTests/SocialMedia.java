package DifficultJsonTests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SocialMedia {
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

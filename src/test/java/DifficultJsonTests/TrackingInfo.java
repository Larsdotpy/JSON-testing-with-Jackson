package DifficultJsonTests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TrackingInfo {
    @JsonProperty("carrier")
    private String carrier;

    @JsonProperty("tracking_number")
    private String trackingNumber;

    // Getters and setters (or Lombok annotations) for carrier and trackingNumber
}

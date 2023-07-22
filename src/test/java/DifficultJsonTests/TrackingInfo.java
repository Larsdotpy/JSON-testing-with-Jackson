package DifficultJsonTests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TrackingInfo {
    public TrackingInfo(String carrier, String trackingNumber) {
        this.carrier = carrier;
        this.trackingNumber = trackingNumber;
    }

    @JsonProperty("carrier")
    private String carrier;

    @JsonProperty("tracking_number")
    private String trackingNumber;

    // Getters and setters (or Lombok annotations) for carrier and trackingNumber
}

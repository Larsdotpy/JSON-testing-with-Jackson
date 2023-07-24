package DifficultJsonTests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NoArgsConstructor;

@lombok.Data
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
}

package DifficultJsonTests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Shipping {
    public Shipping(String method, Address address, TrackingInfo trackingInfo) {
        this.method = method;
        this.address = address;
        this.trackingInfo = trackingInfo;
    }

    @JsonProperty("method")
    private String method;

    @JsonProperty("address")
    private Address address;

    @JsonProperty("tracking_info")
    private TrackingInfo trackingInfo;

    // Getters and setters (or Lombok annotations) for method, address, and trackingInfo
}

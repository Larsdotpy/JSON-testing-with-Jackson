package DifficultJsonTests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Shipping {
    @JsonProperty("method")
    private String method;

    @JsonProperty("address")
    private Address address;

    @JsonProperty("tracking_info")
    private TrackingInfo trackingInfo;

    // Getters and setters (or Lombok annotations) for method, address, and trackingInfo
}

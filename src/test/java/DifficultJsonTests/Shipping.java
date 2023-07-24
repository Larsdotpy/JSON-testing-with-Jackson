package DifficultJsonTests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NoArgsConstructor;

@lombok.Data
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
}

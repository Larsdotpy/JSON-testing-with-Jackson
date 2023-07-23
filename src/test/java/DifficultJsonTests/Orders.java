package DifficultJsonTests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NoArgsConstructor;

import java.util.List;

@lombok.Data
@NoArgsConstructor
public class Orders {
    @JsonProperty("order_id")
    private String orderId;

    @JsonProperty("total")
    private double total;

    @JsonProperty("status")
    private String status;

    @JsonProperty("items")
    private List<Items> items;

    @JsonProperty("shipping")
    private Shipping shipping;

    @JsonProperty("payment")
    private Payment payment;
}

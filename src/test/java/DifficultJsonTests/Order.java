package DifficultJsonTests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Order {
        @JsonProperty("order_id")
        private String orderId;

        @JsonProperty("total")
        private double total;

        @JsonProperty("status")
        private String status;

        @JsonProperty("items")
        private List<Item> items;

        @JsonProperty("shipping")
        private Shipping shipping;

        @JsonProperty("payment")
        private Payment payment;

        // Getters and setters (or Lombok annotations) for orderId, total, status, items, shipping, and payment


}

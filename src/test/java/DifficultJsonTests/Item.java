package DifficultJsonTests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Item {
    @JsonProperty("product")
    private String product;

    public Item(String product, int quantity, double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    @JsonProperty("quantity")
    private int quantity;

    @JsonProperty("price")
    private double price;

    // Getters and setters (or Lombok annotations) for product, quantity, and price
}

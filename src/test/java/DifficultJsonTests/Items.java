package DifficultJsonTests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NoArgsConstructor;

@lombok.Data
@NoArgsConstructor
public class Items {
    @JsonProperty("product")
    private String product;

    public Items(String product, int quantity, double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    @JsonProperty("quantity")
    private int quantity;

    @JsonProperty("price")
    private double price;
}

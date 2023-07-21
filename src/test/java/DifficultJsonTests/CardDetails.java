package DifficultJsonTests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CardDetails {
    @JsonProperty("card_number")
    private String cardNumber;

    @JsonProperty("expiry")
    private String expiry;

    @JsonProperty("cardholder_name")
    private String cardholderName;

    @JsonProperty("billing_address")
    private Address billingAddress;
}

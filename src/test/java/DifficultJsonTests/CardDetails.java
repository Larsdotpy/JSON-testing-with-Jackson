package DifficultJsonTests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CardDetails {
    @JsonProperty("card_number")
    private String cardNumber;

    public CardDetails(String cardNumber, String expiry, String cardholderName, Address billingAddress) {
        this.cardNumber = cardNumber;
        this.expiry = expiry;
        this.cardholderName = cardholderName;
        this.billingAddress = billingAddress;
    }

    @JsonProperty("expiry")
    private String expiry;

    @JsonProperty("cardholder_name")
    private String cardholderName;

    @JsonProperty("billing_address")
    private Address billingAddress;
}

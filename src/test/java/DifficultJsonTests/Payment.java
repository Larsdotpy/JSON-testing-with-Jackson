package DifficultJsonTests;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@JsonSerialize(using = PaymentSerializer.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
public class Payment {
    private Payment(String method, CardDetails cardDetails) {
        this.method = method;
        this.cardDetails = cardDetails;
    }

    private Payment(String method, CardDetails cardDetails, String accountEmail) {
        this.method = method;
        this.cardDetails = cardDetails;
        this.accountEmail = accountEmail;
    }

    public static Payment createWithAccountEmail(String method, CardDetails cardDetails, String accountEmail) {
        return new Payment(method, cardDetails, accountEmail);
    }

    public static Payment createWithoutAccountEmail(String method, CardDetails cardDetails) {
        return new Payment(method, cardDetails);
    }

    @JsonProperty("method")
    private String method;

    @JsonProperty("card_details")
    private CardDetails cardDetails;

    @JsonProperty("account_email")
    private String accountEmail;
}

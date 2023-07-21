package DifficultJsonTests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Payment {
    @JsonProperty("method")
    private String method;

    @JsonProperty("card_details")
    private CardDetails cardDetails;

    @JsonProperty("account_email")
    private String accountEmail;

    // Additional fields for different payment methods can be added here

    // Getters and setters (or Lombok annotations) for method and other additional fields (if any)
}

package DifficultJsonTests;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class PaymentSerializer extends JsonSerializer<Payment> {
    @Override
    public void serialize(Payment payment, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField("method", payment.getMethod());
        jsonGenerator.writeObjectField("card_details", payment.getCardDetails());

        // Only include "account_email" if it's not null
        String accountEmail = payment.getAccountEmail();
        if (accountEmail != null) {
            jsonGenerator.writeStringField("account_email", accountEmail);
        }

        jsonGenerator.writeEndObject();
    }
}

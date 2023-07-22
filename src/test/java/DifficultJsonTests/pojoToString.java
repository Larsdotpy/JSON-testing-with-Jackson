package DifficultJsonTests;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.util.List;

public class pojoToString {
    ObjectMapper objectMapper = new ObjectMapper();


    @Test
    void pojoToJsonString() throws JsonProcessingException {
        FullData fullData = createCustomFullData();

        // Serialize the POJO to JSON string
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(fullData);

        // Print the JSON string
        System.out.println(jsonString);
    }


    private static FullData createCustomFullData() {
        // Create data object
        Data data = new Data();
        data.setUsers(List.of(
                createUser1(),
                createUser2()
        ));

        // Create metadata object
        Metadata metadata = new Metadata();
        metadata.setApp(new AppInfo("Test",
                "Test",
                "Test"));
        metadata.setAuthor(new Author("Test",
                40, new Contact("test@test.com", "+0 (000) 00-000",
                new Address("123 Test St", "Test City", "00000", "TEST"))));
        metadata.setCreatedAt("1800-01-01T00:00Z");
        metadata.setContributors(List.of(
                new Contributor("Test", 100, new Contact("john.test@test.com", "+0 (222) 000-1111",
                        new Address("456 TEST Ave", "TEST CITY", "00001", "TEST"))),
                new Contributor("Robert Test", 0, new Contact("test.johnson@test.com", "+1 (111) 555-5555",
                        new Address("789 TEST St", "test", "100110", "Test")))
        ));
        metadata.setTags(List.of("complex", "nested", "example", "json", "long", "demonstration", "ultra-complex"));

        // Create FullData object
        FullData fullData = new FullData();
        fullData.setMetadata(metadata);
        fullData.setData(data);

        return fullData;
    }

    private static User createUser1() {
        // Create and return User 1 data
        User user = new User();
        user.setId(1);
        user.setUsername("user1");
        user.setProfile(new Profile("Alice", "Smith", 30, "female",
                new Contact("alice.smith@example.com", "+1 (555) 111-1111",
                        new Address("123 Main St", "New York", "10001", "USA")),
                new Preferences("dark", true, "en-US",
                        new Settings(true, new AdvancedOptions(false, true,
                                new Experimental(true, false, true)))),
                new SocialMedia("alice.smith", "@alice_smith", "alice.smith", "in/alice_smith")));
        user.setOrders(List.of(
                createOrder1(),
                createOrder2()
        ));
        return user;
    }

    private static User createUser2() {
        // Create and return User 2 data
        User user = new User();
        user.setId(2);
        user.setUsername("user2");
        user.setProfile(new Profile("Bob", "Johnson", 35, "male",
                new Contact("bob.johnson@example.com", "+1 (555) 222-2222",
                        new Address("789 Oak St", "Chicago", "60601", "USA")),
                new Preferences("light", false, "en-GB",
                        new Settings(false, new AdvancedOptions(true, false,
                                new Experimental(false, true, true)))),
                new SocialMedia("bob.johnson", "@bob_johnson", "bob.johnson", "in/bob_johnson")));
        user.setOrders(List.of(
                createOrder3()
        ));
        return user;
    }


    private static Order createOrder1() {
        // Create and return Order 1 data
        Order order = new Order();
        order.setOrderId("ABC123");
        order.setTotal(100.5);
        order.setStatus("shipped");
        order.setItems(List.of(
                new Item("Widget A", 2, 25.25),
                new Item("Widget B", 1, 50.0)
        ));
        order.setShipping(new Shipping("express", new Address("123 Main St", "New York", "10001", "USA"),
                new TrackingInfo("UPS", "123456789")));
        //Payment without account email
        order.setPayment(Payment.createWithoutAccountEmail("paypal", new CardDetails("**** **** **** 5678", "12/26", "Bob Johnson",
                new Address("789 Oak St", "Chicago", "60601", "USA"))));


        return order;
    }

    private static Order createOrder2() {
        // Create and return Order 2 data
        Order order = new Order();
        order.setOrderId("ABC123");
        order.setTotal(100.5);
        order.setStatus("shipped");
        order.setItems(List.of(
                new Item("Widget A", 2, 25.25),
                new Item("Widget B", 1, 50.0)
        ));
        order.setShipping(new Shipping("express", new Address("123 Main St", "New York", "10001", "USA"),
                new TrackingInfo("UPS", "123456789")));
        //Payment with account email
        order.setPayment(Payment.createWithAccountEmail("credit_card", new CardDetails("**** **** **** 1234", "08/25", "Alice Smith",
                new Address("123 Main St", "New York", "10001", "USA")), "alice.smith@example.com"));
        return order;
    }

    private static Order createOrder3() {
        // Create and return Order 3 data
        Order order = new Order();
        order.setOrderId("ABC123");
        order.setTotal(100.5);
        order.setStatus("shipped");
        order.setItems(List.of(
                new Item("Widget A", 2, 25.25),
                new Item("Widget B", 1, 50.0)
        ));
        order.setShipping(new Shipping("express", new Address("123 Main St", "New York", "10001", "USA"),
                new TrackingInfo("UPS", "123456789")));
        //Payment without account email
        order.setPayment(Payment.createWithoutAccountEmail("credit_card",
                new CardDetails("**** **** **** 1234", "08/25", "Alice Smith",
                        new Address("123 Main St", "New York", "10001", "USA"))));
        return order;
    }
}

class FullData {
    private Metadata metadata;
    private Data data;

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}

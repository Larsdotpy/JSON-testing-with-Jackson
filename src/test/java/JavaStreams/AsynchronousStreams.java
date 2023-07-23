package JavaStreams;

import DifficultJsonTests.Data;
import DifficultJsonTests.JsonData;
import DifficultJsonTests.Orders;
import DifficultJsonTests.Users;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

public class AsynchronousStreams {
    ObjectMapper objectMapper = new ObjectMapper();

    File file = new File("src/test/java/JSON_files/json_example_difficult.json");

    JsonData jsonData = objectMapper.readValue(file, JsonData.class);

    public AsynchronousStreams() throws IOException {
    }

    @Test
    public void asynchronouslyGetAllUsersAndOrders(){
        // Parse the JSON and extract the users data
        List<Users> users = jsonData.getData().getUsers();

        // Perform asynchronous stream operations
        CompletableFuture<List<String>> future = CompletableFuture.supplyAsync(() -> {
            // Get all usernames asynchronously
            return users.parallelStream()
                    .map(Users::getUsername)
                    .collect(Collectors.toList());
        });

        CompletableFuture<List<Orders>> orderFuture = CompletableFuture.supplyAsync(() -> {
            // Get all orders asynchronously
            return users.parallelStream()
                    .flatMap(user -> user.getOrders().stream())
                    .collect(Collectors.toList());
        });

        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        try {
            String usernamesJson = objectMapper.writeValueAsString(users.parallelStream()
                    .map(Users::getUsername)
                    .collect(Collectors.toList()));
            String ordersJson = objectMapper.writeValueAsString(users.parallelStream()
                    .flatMap(user -> user.getOrders().stream())
                    .collect(Collectors.toList()));

            System.out.println("Prettified Usernames:\n" + usernamesJson);
            System.out.println("Prettified Orders:\n" + ordersJson);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void asynchronouslyGerAllOrdersWithTotalAmountGreaterThan50(){
        // Parse the JSON and extract the users data
        List<Users> users = jsonData.getData().getUsers();

        // Define the threshold for total order amount
        double threshold = 50.0;

        // Perform asynchronous stream operation to find order IDs with total amount greater than the threshold
        CompletableFuture<List<String>> orderIdsFuture = CompletableFuture.supplyAsync(() -> {

            // Find order IDs with total amount greater than the threshold asynchronously
            return users.parallelStream()
                    .flatMap(user -> user.getOrders().stream())
                    .filter(order -> order.getTotal() > threshold)
                    .map(Orders::getOrderId)
                    .collect(Collectors.toList());
        });

        // Wait for the future to complete
        try {
            List<String> orderIdsAboveThreshold = orderIdsFuture.get();

            // Print order IDs
            System.out.println("Order IDs above threshold: " + orderIdsAboveThreshold);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}

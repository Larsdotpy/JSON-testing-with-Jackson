package JavaStreams;

import DifficultJsonTests.JsonData;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlatMap {
    ObjectMapper objectMapper = new ObjectMapper();

    File file = new File("src/test/java/JSON_files/json_example_difficult.json");

    JsonData jsonData = objectMapper.readValue(file, JsonData.class);

    public FlatMap() throws IOException {
    }

    @Test
    public void filterByTop3FrequentlyOrderedProducts(){
        Map<String, Long> productFrequencyMap = jsonData.getData().getUsers().stream()
                .flatMap(user -> user.getOrders().stream())
                .flatMap(order -> order.getItems().stream())
                .collect(Collectors.groupingBy(
                        item -> item.getProduct(),
                        Collectors.counting()
                ));

        // Sort the products by frequency and find the top 3
        List<Map.Entry<String, Long>> top3Products = productFrequencyMap.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(3).toList();

        // Print the top 3 most frequently ordered products
        System.out.println("Top 3 most frequently ordered products:");
        for (Map.Entry<String, Long> entry : top3Products) {
            System.out.println("Product: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
    }

    @Test
    public void filterByOrderStatus(){
        jsonData.getData().getUsers().stream()
                .flatMap(users -> users.getOrders().stream())
                .filter(orders -> "shipped".equals(orders.getStatus()))
                .forEach(orders -> System.out.println("Order ID: " + orders.getOrderId()));
    }
}

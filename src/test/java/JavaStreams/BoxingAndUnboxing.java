package JavaStreams;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class BoxingAndUnboxing {
    ObjectMapper objectMapper = new ObjectMapper();
    File file = new File("src/test/java/JSON_files/json_example_difficult.json");
    JsonNode jsonData;

    public BoxingAndUnboxing() {
        try {
            jsonData = objectMapper.readTree(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // BOXING

    @Test
    public void calculateValueForEachUserPerOrder() {
        List<JsonNode> users = StreamSupport.stream(jsonData.get("data").get("users").spliterator(), false).toList();

        // Calculate the total value of orders for each user
        users.stream()
                .map(user -> user.get("orders"))
                .flatMap(orderList -> StreamSupport.stream(orderList.spliterator(), false))
                .mapToDouble(order -> order.get("total").asDouble())
                .boxed()
                .forEach(total -> System.out.println("Total order value: $" + total));
    }

    @Test
    public void getUniqueCitiesOfUsers(){
        List<JsonNode> users = StreamSupport.stream(jsonData.get("data").get("users").spliterator(), false).toList();

        // Find all unique cities where the users live
        Set<String> uniqueCities = users.stream()
                .map(user -> user.get("profile").get("contact").get("address").get("city").asText())
                .collect(Collectors.toCollection(HashSet::new));

        // Print the unique cities
        System.out.println("Unique Cities:");
        uniqueCities.forEach(System.out::println);
    }

    //UNBOXING

    @Test
    public void extractTotalOrderValueConvertToDouble(){
        List<JsonNode> users = StreamSupport.stream(jsonData.get("data").get("users").spliterator(), false).toList();

        // Calculate the total order value for all users
        double totalOrderValue = users.stream()
                .flatMap(user -> StreamSupport.stream(user.get("orders").spliterator(), false))
                .mapToDouble(order -> order.get("total").asDouble())
                .sum();

        // Print the total order value
        System.out.println("Total Order Value: $" + totalOrderValue);
    }

    @Test
    public void calculateAveragePricePerItemForEachProductAcrossAllOrdersPerUser(){
        List<JsonNode> users = StreamSupport.stream(jsonData.get("data").get("users").spliterator(), false).toList();

        // Calculate the average price per item for each product across all orders
        Map<String, Double> productAvgPriceMap = users.stream()
                .flatMap(user -> StreamSupport.stream(user.get("orders").spliterator(), false))
                .flatMap(order -> StreamSupport.stream(order.get("items").spliterator(), false))
                .collect(Collectors.groupingBy(
                        item -> item.get("product").asText(),
                        Collectors.averagingDouble(item -> item.get("price").asDouble())
                ));

        // Print the average price per item for each product
        System.out.println("Average price per item for each product:");
        for (Map.Entry<String, Double> entry : productAvgPriceMap.entrySet()) {
            System.out.println(entry.getKey() + ": $" + entry.getValue());
        }
    }
}

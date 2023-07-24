package JavaStreams;

import DifficultJsonTests.JsonData;
import DifficultJsonTests.Profile;
import DifficultJsonTests.Users;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Teeing {
    ObjectMapper objectMapper = new ObjectMapper();
    File file = new File("src/test/java/JSON_files/json_example_difficult.json");
    @Test
    public void calculateAverageAgeAndTotalOrdersFromJSONData() throws IOException {
        JsonNode root = objectMapper.readTree(file);

        // Extracting the 'users' array from the 'data' section of the JSON
        JsonNode usersNode = root.path("data").path("users");

        // Create a list of User objects using Jackson
        List<Users> users = Arrays.asList(objectMapper.treeToValue(usersNode, Users[].class));

        // Calculate the average age of users' profiles directly
        double averageAge = users.stream()
                .map(Users::getProfile)
                .filter(profile -> profile != null)
                .mapToInt(Profile::getAge)
                .average()
                .orElse(0.0);

        // Calculate the total number of orders
        long totalOrders = users.stream()
                .mapToLong(user -> user.getOrders().size())
                .sum();

        System.out.println("Average age of users: " + averageAge);
        System.out.println("Total number of orders: " + totalOrders);

        // Expected values based on the given JSON data
        double expectedAverageAge = 32.5;
        long expectedTotalOrders = 3;

        // Add assertions for the calculated average age and total number of orders
        Assertions.assertEquals(expectedAverageAge, averageAge, 0.001);
        Assertions.assertEquals(expectedTotalOrders, totalOrders);
    }
}

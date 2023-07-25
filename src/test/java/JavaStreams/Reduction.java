package JavaStreams;

import DifficultJsonTests.JsonData;
import DifficultJsonTests.Users;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Reduction {

    ObjectMapper objectMapper = new ObjectMapper();

    File file = new File("src/test/java/JSON_files/json_example_difficult.json");

    JsonData jsonData = objectMapper.readValue(file, JsonData.class);

    public Reduction() throws IOException {
    }

    @Test
    public void totalOrdersUsingJavaStreamsReduction() {
        // Get the "users" node from the data object
        List<Users> usersList = jsonData.getData().getUsers();

        // Calculate the total number of orders using Java Streams reduction
        int totalOrders = usersList.stream()
                .mapToInt(user -> user.getOrders().size())
                .reduce(0, Integer::sum);

        // Assert the result is correct
        assertEquals(expectedTotalOrders(), totalOrders, "Total number of orders is incorrect");
    }

    private int expectedTotalOrders() {
        return 3;
    }




}

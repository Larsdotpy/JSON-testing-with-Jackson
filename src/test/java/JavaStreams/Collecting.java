package JavaStreams;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Collecting {
    ObjectMapper objectMapper = new ObjectMapper();
    File file = new File("src/test/java/JSON_files/json_example_difficult.json");
    JsonNode jsonData;

    public Collecting() {
        try {
            jsonData = objectMapper.readTree(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void collectOrderIdsFromJSON(){
        // Collect all order_ids using Java streams
        List<String> orderIds = StreamSupport.stream(jsonData
                        .findValue("data")
                        .findValue("users")
                        .spliterator(), false)
                .flatMap(userNode -> StreamSupport.stream(userNode
                        .findValue("orders")
                        .spliterator(), false))
                .map(orderNode -> orderNode.findValue("order_id").asText())
                .collect(Collectors.toList());

        // Assert the result
        List<String> expectedOrderIds = List.of("ABC123", "XYZ789", "PQR456");
        assertEquals(expectedOrderIds, orderIds);
    }

    @Test
    public void getTotalNumberOfOrdersPerUser() {
        // Collect information about users who have placed orders and their order count
        Map<String, Integer> usersWithOrderCount = StreamSupport.stream(jsonData
                        .findValue("data")
                        .findValue("users")
                        .spliterator(), false)
                .collect(Collectors.toMap(
                        userNode -> userNode.findValue("username").asText(),
                        userNode -> StreamSupport.stream(userNode.findValue("orders").spliterator(), false).mapToInt(orderNode -> 1).sum()
                ));

        // Assert the results
        Map<String, Integer> expectedUsersWithOrderCount = new HashMap<>();
        expectedUsersWithOrderCount.put("user1", 2);
        expectedUsersWithOrderCount.put("user2", 1);
        assertEquals(expectedUsersWithOrderCount, usersWithOrderCount);
    }


}
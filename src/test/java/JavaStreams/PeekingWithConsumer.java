package JavaStreams;

import DifficultJsonTests.JsonData;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class PeekingWithConsumer {
    ObjectMapper objectMapper = new ObjectMapper();
    File file = new File("src/test/java/JSON_files/json_example_difficult.json");
    JsonData jsonData = objectMapper.readValue(file, JsonData.class);

    public PeekingWithConsumer() throws IOException {
    }

    @Test
    public void userStreamProcessingWithFirstNameAssertions() throws IOException {
        byte[] jsonDataBytes = Files.readAllBytes(file.toPath());
        String jsonDataString = new String(jsonDataBytes);

        JsonFactory factory = objectMapper.getFactory();
        JsonParser parser = factory.createParser(jsonDataString);

        JsonNode rootNode = objectMapper.readTree(parser);

        Stream<JsonNode> userStream = StreamSupport.stream(Spliterators.spliteratorUnknownSize(
                rootNode.get("data").get("users").elements(), 0), false);

        // Collect usernames in a list for further assertions
        List<String> processedUserNames = userStream
                .map(userNode -> userNode.get("profile").get("firstName").asText())
                .peek(name -> System.out.println("Processing user: " + name)).toList();

        parser.close();

        // Assert the number of users processed
        Assertions.assertEquals(2, processedUserNames.size(), "Number of users processed should be 2");

        // Assert a specific username was processed
        Assertions.assertTrue(processedUserNames.contains("Alice"), "User 'Alice' should be processed");
    }
}
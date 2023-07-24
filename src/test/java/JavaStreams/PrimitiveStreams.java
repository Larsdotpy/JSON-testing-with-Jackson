package JavaStreams;

import DifficultJsonTests.Contributors;
import DifficultJsonTests.JsonData;
import DifficultJsonTests.Metadata;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class PrimitiveStreams {
    ObjectMapper objectMapper = new ObjectMapper();
    File file = new File("src/test/java/JSON_files/json_example_difficult.json");
    JsonData jsonData = objectMapper.readValue(file, JsonData.class);

    public PrimitiveStreams() throws IOException {
    }


    @Test
    public void parsingAndStreamProcessingOfDifficultJsonData(){
        // Access the metadata object from jsonData
        Metadata metadata = jsonData.getMetadata();

        // Example: Print all the tags using Java primitive stream
        List<String> tags = metadata.getTags();
        tags.forEach(System.out::println);

        // Example: Get the names of all contributors using Java primitive stream
        List<Contributors> contributors = metadata.getContributors();
        contributors.stream().map(Contributors::getName).forEach(System.out::println);

        // Assert that the contributors list is not empty
        Assertions.assertFalse(contributors.isEmpty(), "Contributors list should not be empty.");

        // Assert that the first contributor's name is not null
        Assertions.assertNotNull(contributors.get(0).getName(), "First contributor's name should not be null.");
    }
}
